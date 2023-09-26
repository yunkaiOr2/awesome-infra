import { Graph, Shape } from '@antv/x6'

const graph = new Graph({
  container: document.getElementById('container'),
//   grid: true,
//   autoResize: true,
  background: {
    "color": "#E5F1FE"
  }
})

const source = graph.addNode({
  x: 300,
  y: 40,
  width: 80,
  height: 40,
  label: 'IoT/PC/Mobile',
})

const target = graph.addNode({
  x: 420,
  y: 180,
  width: 80,
  height: 40,
  label: '网关',
})

graph.addEdge({
  source,
  target,
})