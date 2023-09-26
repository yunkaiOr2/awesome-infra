import { Graph } from '@antv/x6'

const graph = new Graph({
  container: document.getElementById('container'),
  grid: true,
  background: {
    "color": "rgb(229, 241, 254)"
  }
})

const source = graph.addNode({
  x: 300,
  y: 40,
  width: 80,
  height: 40,
  label: 'Hello',
})

const target = graph.addNode({
  x: 420,
  y: 180,
  width: 80,
  height: 40,
  label: 'IoT/PC/Mobile',
})

graph.addEdge({
  source,
  target,
})