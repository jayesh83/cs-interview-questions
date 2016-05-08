package crackingthecode.part1datastructures

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter1ArraysAndStringsSpec extends Specification {

    def "constructor"() {
        expect:
        new Chapter1ArraysAndStrings() != null
    }

    def "isUniqueCharacters"() {
        expect:
        Chapter1ArraysAndStrings.isUniqueCharacters(a) == b
        Chapter1ArraysAndStrings.isUniqueCharacters2(a) == b

        where:
        a                             || b
        null                          || false
        ""                            || false
        "abc"                         || true
        "aab"                         || false
        "qazwsxedcrfvtgbyhnujmikolp"  || true
        "qwertyuiopplkjhgfdsazxcvbnm" || false
    }

    def "reverseString"() {
        expect:
        Chapter1ArraysAndStrings.reverseString(a as char[]) == b as char[]

        where:
        a            || b
        null         || null
        ""           || ""
        "bad"        || "dab"
        "1234567890" || "0987654321"
        "test"       || "tset"
    }

    def "removeDuplicates"() {
        expect:
        Chapter1ArraysAndStrings.removeDuplicates(a) == b

        where:
        a              || b
        null           || null
        ""             || ""
        "baaaaaaaaaad" || "bad"
        "1123"         || "123"
        "abcc"         || "abc"
    }

    def "isAnagram"() {
        expect:
        Chapter1ArraysAndStrings.isAnagram(a, b) == c
        Chapter1ArraysAndStrings.isAnagram2(a, b) == c

        where:
        a            || b            || c
        null         || "abc"        || false
        "abx"        || null         || false
        "a"          || "a"          || false
        "abc"        || "ababc"      || false
        "abc"        || "abc"        || true
        "has"        || "ash"        || true
        "gas"        || "sag"        || true
        "Deductions" || "Discounted" || true
        "fall"       || "foul"       || false
    }

    def "replaceSpace"() {
        expect:
        Chapter1ArraysAndStrings.replaceSpaces(a) == b
        Chapter1ArraysAndStrings.replaceSpaces2(a) == b

        where:
        a      || b
        null   || null
        " "    || "%20"
        "abc"  || "abc"
        "a bc" || "a%20bc"
        "  "   || "%20%20"
    }

    def "rotateImage"() {
        expect:
        Chapter1ArraysAndStrings.rotateImage(a as int[][]) == b as int[][]
        Chapter1ArraysAndStrings.rotateImage2(a as int[][]) == b as int[][]

        where:
        a              || b
        null           || null
        [[1, 2, 3],
         [1, 2, 3],
         [1, 2, 3]]    || [[1, 1, 1],
                           [2, 2, 2],
                           [3, 3, 3]]
        [[1, 2, 3, 4],
         [5, 6, 7, 8],
         [9, 0, 1, 2],
         [3, 4, 5, 6]] || [[3, 9, 5, 1],
                           [4, 0, 6, 2],
                           [5, 1, 7, 3],
                           [6, 2, 8, 4]]
    }

    def "markRows"() {
        expect:
        Chapter1ArraysAndStrings.markRows(a as int[][]) == b as int[][]

        where:
        a           || b
        null        || null
        [[5, 0, 5],
         [5, 5, 5],
         [5, 5, 5]] || [[0, 0, 0],
                        [5, 0, 5],
                        [5, 0, 5]]
        [[5, 5, 5],
         [5, 0, 5],
         [5, 5, 5]] || [[5, 0, 5],
                        [0, 0, 0],
                        [5, 0, 5]]

    }

    def "isSubstring"() {
        expect:
        Chapter1ArraysAndStrings.isSubstring(a, b) == c

        where:
        a             || b             || c
        null          || null          || false
        null          || "asdf"        || false
        "asdfs"       || null          || false
        "abc"         || "abdefd"      || false
        "waterbottle" || "erbottlewat" || true
        "apple"       || "pleap"       || true
        "apple"       || "ppale"       || false
    }
}
