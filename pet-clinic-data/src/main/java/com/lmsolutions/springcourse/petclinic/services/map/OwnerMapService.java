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

import com.lmsolutions.springcourse.petclinic.models.Owner;
import com.lmsolutions.springcourse.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 *
 */

@Service
public final class OwnerMapService extends AbstractMapService<Owner, Long>
        implements OwnerService {
    /**
     * @param id
     * @return
     */
    @Override
    public Owner findById(final Long id) {
        return super.findById(id);
    }

    /**
     * @return
     */

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    /**
     * @param id
     */
    @Override
    public void deleteByID(final Long id) {
        super.deleteByID(id);
    }

    /**
     * @param object
     */
    @Override
    public void delete(final Owner object) {
        super.delete(object);

    }

    /**
     * @param id
     * @param owner
     * @return
     */
    @Override
    public Owner save(final Long id, final Owner owner) {
        return super.save(id, owner);
    }

    @Override
    public Owner findByName(String name) {
        return map.entrySet().stream()
                .filter(x -> name.equals(x.getValue().getLastName())).findFirst().get().getValue();
        //.map(x->x.getValue().getLastName());
        //.collect(Collectors.joining());
    }
}
