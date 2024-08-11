package pattern.visitor.impl;

import pattern.interviewee.impl.Dolphin;
import pattern.interviewee.impl.Lion;
import pattern.interviewee.impl.Monkey;
import pattern.visitor.AnimalVisitor;

public class Speak implements AnimalVisitor {
    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Ooh oo aa aa!");
    }

    @Override
    public void visitLion(Lion lion) {
        System.out.println("Roaaar!");
    }

    @Override
    public void visitDolphin(Dolphin dolphin) {
        System.out.println("Tuut tuttu tuutt!");
    }
}
