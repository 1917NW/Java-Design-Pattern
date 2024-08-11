package pattern.interviewee.impl;

import pattern.interviewee.Animal;
import pattern.visitor.AnimalVisitor;

public class Dolphin implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitDolphin(this);
    }
}
