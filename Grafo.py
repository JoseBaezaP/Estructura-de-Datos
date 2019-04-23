#!/usr/local/bin/python
#
# -*- coding: latin-1 -*-
import os, sys
 
#Grafo no ponderado
 
import networkx as nx
import matplotlib.pyplot as plt
G=nx.Graph()
G.add_nodes_from(["CampCa","PlzTo","LaFlor","Mayor" ,"LaBr","PlzBol","AC","AvB","ClinVi","Une","UniCar","AgTEr","PtoCab", "StaRo", "CPol"])
 
G.add_edge("CampCa","PlzTo")
 
G.add_edge("PlzTo","Mayor")
 
G.add_edge("PlzTo","CPol")
 
G.add_edge("LaFlor","CPol")
 
G.add_edge("Mayor","LaFlor")
 
G.add_edge("LaFlor","StaRo")
 
G.add_edge("LaFlor","PlzBol")
 
G.add_edge("StaRo","LaBr")
 
G.add_edge("StaRo","AvB")
 
G.add_edge("StaRo","Une")
 
G.add_edge("StaRo","PlzBol")
 
G.add_edge("StaRo","UniCar")
 
G.add_edge("StaRo","LaBr")
 
G.add_edge("StaRo","AC")
 
G.add_edge("AC","AvB")
 
G.add_edge("AC","LaBr")
 
G.add_edge("AC","ClinVi")
 
G.add_edge("ClinVi","AvB")
 
G.add_edge("AvB", "UniCar")
 
G.add_edge("AvB","Une")
 
G.add_edge("AvB","AgTEr")
 
G.add_edge("AgTEr","PtoCab")
 
nx.draw_circular(G,node_size=3000,node_color='b')
plt.show()
 
print "Nodos: ", G.number_of_nodes(), G.nodes()
print "Enlaces: ", G.number_of_edges(),G.edges()
 
nx.draw(G)
plt.savefig("networkx1.png")