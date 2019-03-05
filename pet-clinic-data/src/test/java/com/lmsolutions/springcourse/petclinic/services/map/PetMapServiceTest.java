/*
 * MIT License
 *
 * Copyright (c) 2019 Laurent Morissette
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.lmsolutions.springcourse.petclinic.services.map;

import com.lmsolutions.springcourse.petclinic.models.Pet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@DisplayName("Spring boot 2 mockito2 Junit5 example")
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringBootTestContextBootstrapper.class})

@SpringBootTest
public class PetMapServiceTest {
    Set<Pet> pets;
    //@CompositeValue.Component
    PetMapService petMapService;

    @BeforeEach
    void setUp() {
        pets = new HashSet<>();
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());
        petMapService = new PetMapService();
        //petMapService=mock(PetMapService.class);
        petMapService.save(0L, new Pet());
        petMapService.save(1L, new Pet());
        petMapService.save(2L, new Pet());

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findAll() {
//         Mockito.when(petMapService.findAll()).thenReturn(pets);
        Assert.assertEquals(3, petMapService.findAll().size());
    }

    @Test
    public void deleteByID() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void save() {
    }
}