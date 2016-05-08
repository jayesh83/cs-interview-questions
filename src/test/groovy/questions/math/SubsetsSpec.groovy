package questions.math

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SubsetsSpec extends Specification {

    def "constructor"() {
        expect:
        new Subsets() != null
    }

    def "subsets"() {
        expect:
        Subsets.subsets(a) == b
        Subsets.subsets2(a as int[]) == b

        where:
        a         || b
        null      || null
        []        || [[]]
        [1]       || [[], [1]]
        [1, 2]    || [[], [1], [2], [1, 2]]
        [1, 2, 3] || [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        [3, 1, 2] || [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
    }
}
