package pattern.interviewee;

import pattern.visitor.AnimalVisitor;

public interface Animal {
    void accept(AnimalVisitor visitor);
}
