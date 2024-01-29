package algorithms.searching

import java.util.*

fun bfs(graph: Map<Int, List<Int>>, startNode: Int) {
    val visited = mutableSetOf<Int>()
    val queue: Queue<Int> = LinkedList()

    queue.add(startNode)
    visited.add(startNode)

    while (queue.isNotEmpty()) {
        val currentNode = queue.poll()
        print("$currentNode ")

        for (neighbor in graph[currentNode] ?: emptyList()) {
            if (neighbor !in visited) {
                queue.add(neighbor)
                visited.add(neighbor)
            }
        }
    }
}