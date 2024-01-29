package algorithms.searching

fun dfs(graph: Map<Int, List<Int>>, startNode: Int, visited: MutableSet<Int>) {
    if (startNode !in visited) {
        print("$startNode ")
        visited.add(startNode)

        for (neighbor in graph[startNode] ?: emptyList()) {
            dfs(graph, neighbor, visited)
        }
    }
}