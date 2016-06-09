package questions.tree

import api.TreeNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstHeightSpec extends Specification {

    def tree = new TreeNode<>(3)

//                (3)
//               /   \
//            (2)     (5)
//           /   \      \
//         (1)   (4)    (6)
//                        \
//                         (7)
    def "setup"() {
        tree.right = new TreeNode<>(5)
        tree.right.right = new TreeNode<>(6)
        tree.right.right.right = new TreeNode<>(7)

        tree.left = new TreeNode<>(2)
        tree.left.right = new TreeNode<>(4)
        tree.left.left = new TreeNode<>(1)
    }

    def "getHeight"() {
        expect:
        BstHeight.getHeight(tree) == 3
    }
}