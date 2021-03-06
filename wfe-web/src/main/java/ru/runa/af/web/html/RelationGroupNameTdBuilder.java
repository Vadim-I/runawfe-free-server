/*
 * This file is part of the RUNA WFE project.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; version 2.1
 * of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
 */
package ru.runa.af.web.html;

import org.apache.ecs.StringElement;
import org.apache.ecs.html.TD;

import ru.runa.common.web.Resources;
import ru.runa.common.web.html.TdBuilder;
import ru.runa.wfe.relation.RelationPair;

public class RelationGroupNameTdBuilder implements TdBuilder {

    @Override
    public TD build(Object object, Env env) {
        TD td = new TD();
        td.setClass(Resources.CLASS_LIST_TABLE_TD);
        td.addElement(new StringElement(getValue(object, env)));
        return td;
    }

    @Override
    public String[] getSeparatedValues(Object object, Env env) {
        return new String[] { getValue(object, env) };
    }

    @Override
    public int getSeparatedValuesCount(Object object, Env env) {
        return 1;
    }

    @Override
    public String getValue(Object object, Env env) {
        String name = ((RelationPair) object).getRelation().getName();
        return name == null ? "" : name;
    }
}
