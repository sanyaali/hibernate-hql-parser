/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * JBoss, Home of Professional Open Source
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.hibernate.hql.ast.spi.predicate;

import java.util.List;

/**
 * An {@code IN} predicate.
 *
 * @author Gunnar Morling
 */
public abstract class InPredicate<Q> extends AbstractPredicate<Q> {

	protected final String propertyName;
	protected final List<Object> values;

	public InPredicate(String propertyName, List<Object> values) {
		super( Predicate.Type.IN );
		this.propertyName = propertyName;
		this.values = values;
	}

	@Override
	public String toString() {
		return "( IN " + propertyName + " " + values + " )";
	}
}
