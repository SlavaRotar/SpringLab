package com.arch.tvchannel.service.program;

import com.arch.tvchannel.dto.program.ProgramDTOCreate;
import com.arch.tvchannel.dto.program.ProgramDTOUpdate;
import com.arch.tvchannel.dto.type.TypeDTOCreate;
import com.arch.tvchannel.model.Show;
import com.arch.tvchannel.model.Type;
import com.arch.tvchannel.repository.ProgramRepository;
import com.arch.tvchannel.repository.TypeRepository;
import com.arch.tvchannel.service.type.TypeServiceImpl;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@ComponentScan(basePackages = {"com.arch.tvchannel.service"})
@ComponentScan(basePackages = {"com.arch.tvchannel.dao"})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ShowServiceImplTest {

    @Autowired
    @Mock
    TypeServiceImpl typeService;

    @Autowired
    @Mock
    ProgramRepository programRepository;

    @Autowired
    @Mock
    TypeRepository typeRepository;

    @Autowired
    @Mock
    ProgramServiceImpl service;

    @Test
    @Order(1)
    public void create() throws Exception{

        var type = Type.builder()
                .name("Докуменалка")
                .programs(new HashSet<>())
                .build();

        typeService.create(type);

        var program = Show.builder()
                .name("teste")
                .type(typeRepository.findById(1L).get())
                .monday(new HashSet<>())
                .tuesday(new HashSet<>())
                .wednesday(new HashSet<>())
                .thursday(new HashSet<>())
                .friday(new HashSet<>())
                .saturday(new HashSet<>())
                .sunday(new HashSet<>())
                .build();

        service.create(program);

        assert program.getId() > 0;

    }

    @Test
    @Order(2)
    public void update() throws Exception{
        create();

        var program = Show.builder()
                .id(1L)
                .name("Краще Подзвоніть Солу")
                .type(typeRepository.findById(1L).get())
                .monday(new HashSet<>())
                .tuesday(new HashSet<>())
                .wednesday(new HashSet<>())
                .thursday(new HashSet<>())
                .friday(new HashSet<>())
                .saturday(new HashSet<>())
                .sunday(new HashSet<>())
                .build();

        service.update(program);

        assert program.getName().equals("Краще Подзвоніть Солу");

    }

    @Test
    @Order(3)
    public void findAll() throws Exception{
        create();

        List<Show> list = programRepository.findAll();

        assert list.size() > 0;
    }


    @Test
    @Order(4)
    public void findById() throws Exception{
        create();

        Show show = programRepository.findById(1L).get();

        assert show.getId().equals(1L);
    }

    @Test
    @Order(5)
    public void deleteById() throws Exception{
        create();

        programRepository.deleteById(1L);

        Show show = null;

        Optional<Show> programOptional = programRepository.findById(1L);

        if (programOptional.isPresent()) {
            show = programOptional.get();
        }

        assert show == null;
    }

    @Test
    @Order(6)
    public void createDTO() throws Exception{

        TypeDTOCreate dtoCreate = new TypeDTOCreate();
        dtoCreate.setName("typetest");

        typeService.createDTO(dtoCreate);

        ProgramDTOCreate dtoCreate1 = new ProgramDTOCreate();
        dtoCreate1.setName("asd");
        dtoCreate1.setType(1L);

        service.createDTO(dtoCreate1);

        assert dtoCreate1.getName().equals("asd");

    }

    @Test
    @Order(7)
    public void updateDTO() throws Exception{
        createDTO();

        ProgramDTOUpdate dtoUpdate = new ProgramDTOUpdate();
        dtoUpdate.setId(1L);
        dtoUpdate.setName("234234ssdfsdf");
        dtoUpdate.setType(1L);

        service.updateDTO(dtoUpdate);

        assert dtoUpdate.getName().equals("234234ssdfsdf");

    }

}