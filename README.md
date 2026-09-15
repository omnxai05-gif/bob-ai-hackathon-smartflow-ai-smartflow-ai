TITLE ::- 
 bob-ai-hackathon-smartflow-ai-smartflow-ai
AI-powered supply chain disruption assistant and fleet utilization optimizer.

Track	[AI / DevOps / Sustainability / Open]

Team Lead	Om nayak — 26MSIT069@charusat.edu.in
Members	Ayush patel , dhruv patel , krunal parmar 

Problem Statement ::- 
   AI-powered supply chain disruption assistant and fleet utilization optimizer.

Solution ::-
   web dashboard + AI assistant
   SmartFlow AI

SmartFlow AI is an AI-powered Supply Chain Disruption Assistant and Fleet Utilisation Optimizer designed to help organizations quickly identify shipment disruptions, recommend alternative routes, optimize fleet utilization, and monitor temperature-sensitive cargo. The system continuously analyzes shipment information, transportation routes, disruption events, fleet availability, and cold-chain IoT sensor data. When a disruption such as severe weather, a port strike, or a geopolitical event occurs, SmartFlow AI identifies the affected shipments and estimates their potential impact.

**Key Features**

1. Disruption Detection and Impact Analysis :-
    The system detects active disruptions and automatically identifies the shipments, routes, and fleet assets that may be affected. It prioritizes critical shipments based on factors such as urgency, delivery deadlines, cargo type, and risk level.

2. AI-Based Route Recommendation :-
   For affected shipments, the system analyzes available routes and recommends suitable alternatives. It compares options based on estimated delay, distance, cost, and risk, helping logistics teams select the most efficient route.

3. Fleet Utilisation Optimizer :-
   SmartFlow AI monitors the availability and utilization of trucks, containers, and other fleet assets. It identifies idle or underutilized assets and recommends their redeployment to shipments that require additional capacity.

4. Cold-Chain Monitoring :-
   For temperature-sensitive shipments such as vaccines, food, and other perishable goods, the system analyzes IoT temperature sensor data. It detects temperature excursions, identifies affected shipments, and classifies the severity of the issue so that action can be taken before delivery.

5. AI Decision Support Dashboard :-
  A centralized dashboard provides logistics teams with real-time visibility into active disruptions, affected shipments, fleet availability, route recommendations, and cold-chain alerts. The AI assistant also provides clear recommendations so that users can make faster operational decisions.

**Example Workflow**

When a major disruption occurs at a port:

Disruption Detected
↓
Identify Affected Shipments
↓
Calculate Risk and Expected Delay
↓
Find Alternative Routes/Carriers
↓
Check Available Fleet Assets
↓
Monitor Cold-Chain Conditions
↓
Generate AI Recommendation
↓
Logistics Team Takes Action

 **Expected Impact**

SmartFlow AI aims to reduce the impact of supply-chain disruptions by providing early identification of affected shipments, faster rerouting decisions, better utilization of available fleet assets, and early detection of cold-chain problems.

Instead of manually tracking hundreds of shipments and fleet assets, logistics teams receive a single AI-powered view of the situation with prioritized recommendations for action.

**Technology Stack**
  Frontend :- HTML , CSS , JavaScript, Bootstrap
  Backend :- java , Spring Boot
  Database :- sqldeveloper
  AI :- Python + ML/LLM API , IBM Bob
**Visualization**
  - Chart.js
  - Maps
⚡ How to Run
  1. Python 3.9+
python --version
  2. create database
  CREATE DATABASE smartflow_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
  3. Install dependencies
  cd python_backend
  pip install -r requirements.txt
  4.
    cd python_backend
    python run.py


















