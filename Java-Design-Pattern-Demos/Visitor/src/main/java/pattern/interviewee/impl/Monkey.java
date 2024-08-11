package pattern.interviewee.impl;

import pattern.interviewee.Animal;
import pattern.visitor.AnimalVisitor;

public class Monkey implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitMonkey(this);
    }
}
