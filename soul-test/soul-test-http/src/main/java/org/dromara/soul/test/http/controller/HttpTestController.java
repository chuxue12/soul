/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * Contributor license agreements.See the NOTICE file distributed with
 * This work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * he License.You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.dromara.soul.test.http.controller;


import org.dromara.soul.test.http.dto.UserDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController.
 *
 * @author xiaoyu
 */
@RestController
public class HttpTestController {

    /**
     * Post user dto.
     *
     * @param userDTO the user dto
     * @return the user dto
     */
    @PostMapping("/payment")
    public UserDTO post(final UserDTO userDTO) {
        userDTO.setUserId("xiaoyu");
        return userDTO;
    }

    /**
     * Find by user id string.
     *
     * @return the string
     */
    @GetMapping("/findByUserId")
    public String findByUserId() {
        return "helloWorld!";
    }

    /**
     * Test get integer.
     *
     * @param id the id
     * @return the integer
     */
    @GetMapping("/id")
    public Integer testGet(@RequestParam("id") Integer id) {
        return id;
    }

    /**
     * Gets path variable.
     *
     * @param id   the id
     * @param name the name
     * @return the path variable
     */
    @GetMapping("/path/{id}")
    public String getPathVariable(@PathVariable("id") String id, @RequestParam("name") String name) {
        return id + "_" + name;
    }

    /**
     * Put path variable and body string.
     *
     * @param id      the id
     * @param userDTO the user dto
     * @return the string
     */
    @PutMapping("/putPathBody/{id}")
    public String putPathVariableAndBody(@PathVariable("id") String id, @RequestBody UserDTO userDTO) {
        return id + "_" + userDTO.getUserName();
    }

    /**
     * Put path variable string.
     *
     * @param id the id
     * @return the string
     */
    @PutMapping("/putPath/{id}")
    public String putPathVariable(@PathVariable("id") String id) {
        return id;
    }

    /**
     * Delete path variable string.
     *
     * @param id the id
     * @return the string
     */
    @DeleteMapping("/deletePath/{id}")
    public String deletePathVariable(@PathVariable("id") String id) {
        return id;
    }


}