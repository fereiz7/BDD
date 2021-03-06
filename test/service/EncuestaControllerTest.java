/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dominio.Encuesta;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emilio
 */
public class EncuestaControllerTest {

    private EncuestaController encuestaControllerTested;
    private Encuesta encuestaAzc;

    public EncuestaControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        encuestaControllerTested = new EncuestaController();
        encuestaAzc = new Encuesta(1, "Paro", "Por falta de agua", LocalDateTime.parse("2018-11-19T12:50:49"), LocalDateTime.parse("2018-11-20T12:50:49"), 1);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getEncuestasByIdUnidad method, of class EncuestaController.
     */
    @Test
    public void testGetEncuestasByIdUnidad() {
        System.out.println("getEncuestasByIdUnidad");
        int idUnidad = 1;
        EncuestaController instance = new EncuestaController();
        List<Encuesta> expResult = new ArrayList<>();
        expResult.add(encuestaAzc);
        List<Encuesta> result = instance.getEncuestasByIdUnidad(idUnidad);
        assertEquals(expResult, result);
//        result.stream().forEach((e) -> System.out.println(e));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEncuestasByIdUnidad method, of class EncuestaController.
     */
    @Test
    public void testGetEncuestasByIdUnidadJSON() {
        System.out.println("getEncuestasByIdUnidadJSON");
        int idUnidad = 1;
        EncuestaController instance = new EncuestaController();
        List<Encuesta> expResult = new ArrayList<>();
        expResult.add(encuestaAzc);
        List<Encuesta> result = instance.getEncuestasByIdUnidad(idUnidad);
        assertEquals(expResult, result);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writeValueAsString(result);
            System.out.println(jsonString);
//        result.stream().forEach((e) -> System.out.println(e));
// TODO review the generated test code and remove the default call to fail.
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Test of getEncuestaById method, of class EncuestaController.
     */
    @Test
    public void testGetEncuestasById() {
        System.out.println("getEncuestasById");
        int idEncuesta = 1;
        EncuestaController instance = new EncuestaController();
        Encuesta expResult = encuestaAzc;
        Encuesta result = instance.getEncuestaById(idEncuesta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
