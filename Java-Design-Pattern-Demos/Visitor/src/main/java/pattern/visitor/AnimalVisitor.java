package pattern.visitor;

import pattern.interviewee.impl.Dolphin;
import pattern.interviewee.impl.Lion;
import pattern.interviewee.impl.Monkey;

public interface AnimalVisitor {
    void visitMonkey(Monkey monkey);

    void visitLion(Lion lion);

    void visitDolphin(Dolphin dolphin);
}
