import java.util.*;

class  AdjSetGraph<V> implements Graph<V> {
  private Map<V,Set<V>> vertices;

    // complete the implementation by adding all the methods
    // defined in the Graph interface

  public AdjSetGraph() {
    vertices = new HashMap<V, Set<V>>();
  }

  public void addVertex(V v) {

  }

  public Iterable<V> vertices(){
    return null;
  }

  public int vertexCount() {
    return 0;
  }

  public boolean hasVertex(V v) {

  }

  public void addEdge(V v1, V v2) {
  }

  public Iterable<V> neighbors(V v) {
    return null;
  }

  public int degree(V v) {
    return vertices.get(v).size;
  }
    // (you may also wish to add private helper methods to perform
    //  tasks that are common to several public methods)

  // useful for debugging, once methods are implemented
  public String toString() {
    return GraphUtils.dumpGraph(this);
  }
}
