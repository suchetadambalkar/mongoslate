/*
   Copyright [2013] [Entrib Technologies]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package  com.entrib.mongoslate.visitor.expr.semantics;

import com.entrib.mongoslate.expr.Expression;
import com.entrib.mongoslate.expr.NegationExpression;
import com.entrib.mongoslate.expr.UnaryExpression;

/**
 * Class to check the semantics of the logical negation expression.
 *
 * This will only allow following types of operands in a negation expression,
 * <ul>
 *   <li>Logical</li>
 *   <li>Relational</li>
 *   <li>Negation</li>
 *   <li>Exists</li>
 * </ul>
 *
 * @author Atul M Dambalkar (atul@entrib.com)
 */
public class NegationExpressionSemanticsChecker {

    public static boolean checkSemantics(NegationExpression expression) {
        Expression.ExpressionTypeEnum expressionTypeEnum =
                expression.getChild().getExpressionTypeEnum();
        return expressionTypeEnum == Expression.ExpressionTypeEnum.Negation
                || expressionTypeEnum == Expression.ExpressionTypeEnum.Logical
                || expressionTypeEnum == Expression.ExpressionTypeEnum.Relational
                || expressionTypeEnum == Expression.ExpressionTypeEnum.Exists;
    }

}
