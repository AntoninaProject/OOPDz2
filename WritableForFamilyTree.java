package model.family_tree;

import model.familyTree.FamilyTree;
import model.human.Human;

public interface WritableForFamilyTree {
    boolean save(FamilyTree<Human> tree);
    FamilyTree<Human> read();
}