/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.util.crate;

import org.jooq.DataType;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;

import java.sql.Timestamp;

/**
 * Supported data types for the {@link SQLDialect#CRATE} dialect
 *
 * @see <a href="https://crate.io/docs/reference/sql/data_types.html#data-types">https://crate.io/docs/reference/sql/data_types.html#data-types</a>
 */
    public class CrateDataType {

    // -------------------------------------------------------------------------
    // Default SQL data types and synonyms thereof
    // -------------------------------------------------------------------------
    public static final DataType<Integer>    INTEGER                  = new DefaultDataType<Integer>(SQLDialect.CRATE, SQLDataType.INTEGER, "integer");
    public static final DataType<Short>      SHORT                    = new DefaultDataType<Short>(SQLDialect.CRATE, SQLDataType.SMALLINT, "short");
    public static final DataType<Float>      FLOAT                    = new DefaultDataType<Float>(SQLDialect.CRATE, SQLDataType.REAL, "float");
    public static final DataType<Double>     DOUBLE                   = new DefaultDataType<Double>(SQLDialect.CRATE, SQLDataType.DOUBLE, "double");
    public static final DataType<Long>       LONG                     = new DefaultDataType<Long>(SQLDialect.CRATE, SQLDataType.BIGINT, "long");
    public static final DataType<byte[]>     BYTE                     = new DefaultDataType<byte[]>(SQLDialect.CRATE, SQLDataType.BINARY, "byte");
    public static final DataType<Boolean>    BOOLEAN                  = new DefaultDataType<Boolean>(SQLDialect.CRATE, SQLDataType.BOOLEAN, "boolean");
    public static final DataType<String>     STRING                   = new DefaultDataType<String>(SQLDialect.CRATE, SQLDataType.VARCHAR, "string");
    public static final DataType<Timestamp>  TIMESTAMP                = new DefaultDataType<Timestamp>(SQLDialect.CRATE, SQLDataType.TIMESTAMP, "timestamp");
    public static final DataType<byte[]>     BLOB                     = new DefaultDataType<byte[]>(SQLDialect.CRATE, SQLDataType.BLOB, "blob");

    public static final DataType<Long>       IP                       = new DefaultDataType<Long>(SQLDialect.CRATE, SQLDataType.BIGINT, "ip");
    public static final DataType<Object>     OBJECT                   = new DefaultDataType<Object>(SQLDialect.CRATE, SQLDataType.OTHER, "object");
    public static final DataType<Object>     GEO_POINT                = new DefaultDataType<Object>(SQLDialect.CRATE, SQLDataType.OTHER, "geo_point");
    public static final DataType<Object>     GEO_SHAPE                = new DefaultDataType<Object>(SQLDialect.CRATE, SQLDataType.OTHER, "geo_shape");
}
