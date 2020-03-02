package fr.umlv.devops.Project;

import fr.umlv.devops.Project.model.Animaux;
import fr.umlv.devops.Project.repository.AnimauxRepository;
import fr.umlv.devops.Project.service.AnimauxService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AnimalRessourceTest {

    @LocalServerPort
    private int port;


    @MockBean
    private AnimauxService animauxService;
    @MockBean
    private AnimauxRepository animauxRepository;

    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    public void getAll() throws Exception {

        List<Animaux> animaux = this.restTemplate.getForObject("http://localhost:" + port + "/animaux", List.class);

        assertEquals(0, animaux.size());

    }

    @Test
    public void postAnimal() {
        Animaux animal=new Animaux("Name","M",null,null);
        animal.setId(1L);
        when(animauxRepository.save(animal)).thenReturn(animal);
        Animaux p=this.restTemplate.postForObject("http://localhost:" + port + "/animaux",animal , Animaux.class);


    }

    @Test
    public void getOne() {
        Animaux personne=new Animaux("Name","M",null,null);
        Animaux p=this.restTemplate.getForObject("http://localhost:" + port + "/animaux/1", Animaux.class);
    }

}