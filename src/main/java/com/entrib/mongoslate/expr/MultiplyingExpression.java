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
package  com.entrib.mongoslate.expr;

import com.entrib.mongoslate.type.Value;
import com.entrib.mongoslate.visitor.expr.ExpressionVisitable;
import com.entrib.mongoslate.visitor.expr.ExpressionVisitor;

/**
 * Class to represent multiplicative expression.
 * 
 * @author Atul M Dambalkar (atul@entrib.com)
 */
public class MultiplyingExpression implements BinaryExpression, ExpressionVisitable, NumberExpression {

    public enum MultiplyingOperatorEnum { MULTI, DIV, MOD };

    private MultiplyingOperatorEnum multiplyingOperatorEnum;
    private Expression left;
    private Expression right;
    private Value result;

    public MultiplyingExpression() {
    }

    public MultiplyingExpression(MultiplyingOperatorEnum multiplyingOperatorEnum, Expression left, Expression right) {
        this.multiplyingOperatorEnum = multiplyingOperatorEnum;
        this.left = left;
        this.right = right;
    }

    public ExpressionTypeEnum getExpressionTypeEnum() {
        return ExpressionTypeEnum.Multiplying;
    }

    public MultiplyingOperatorEnum getMultiplyingOperatorEnum() {
        return multiplyingOperatorEnum;
    }

    public void setMultiplyingOperatorEnum(MultiplyingOperatorEnum multiplyingOperatorEnum) {
        this.multiplyingOperatorEnum = multiplyingOperatorEnum;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Object accept(ExpressionVisitor visitor) {
        return visitor.visit(this);
    }

    public boolean isLeaf() {
        return false;
    }

    public Value getResult() {
        return result;
    }

    public void setResult(Value result) {
        this.result = result;
    }
}
