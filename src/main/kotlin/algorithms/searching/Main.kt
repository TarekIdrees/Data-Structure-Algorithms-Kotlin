package algorithms.searching

fun main() {
    val array = arrayOf(10, 50, 80, 9, 1, 60)
    val key = 1
    println(linearSearch(array, key))
    println(binarySearch(array.sortedArray(), array.indices.first, array.indices.last, 9))

    val graph: Map<Int, List<Int>> = mapOf(
        1 to listOf(2, 3),
        2 to listOf(1, 4, 5),
        3 to listOf(1, 6),
        4 to listOf(2),
        5 to listOf(2, 7),
        6 to listOf(3),
        7 to listOf(5)
    )

    println("BFS traversal:")
    bfs(graph, 5)

    val visited = mutableSetOf<Int>()

    println("DFS traversal:")
    dfs(graph, 1, visited)
}