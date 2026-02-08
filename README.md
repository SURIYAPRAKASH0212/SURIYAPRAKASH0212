
<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:FF0080,100:7928CA&height=300&section=header&text=Hello%20World!&fontSize=90&animation=fadeIn&fontAlignY=38&desc=I%20am%20Suriyaprakash%20👋&descAlignY=51&descAlign=62" alt="Header" />
</div>

<h3 align="center">Passionate Java Developer | Tech Enthusiast | Problem Solver</h3>

<div align="center">
  
  [![Typing SVG](https://readme-typing-svg.herokuapp.com?font=Fira+Code&pause=1000&color=F72C5B&center=true&vCenter=true&width=435&lines=Java+Developer;React+Enthusiast;Python+Coder;Problem+Solver;Quick+Learner)](https://git.io/typing-svg)

</div>

<br/>

### 🚀 About Me

- 🔭 I’m currently working on **Full Stack Development**
- 🌱 I’m currently learning **Spring Boot & Microservices**
- 💬 Ask me about **Java, Python, React, and System Design**
- ⚡ **Soft Skills:** Leadership, Problem Solving, Quick Learning
- 📫 How to reach me: **[Add your email here]**
- ⚡ Fun fact: **I love solving LeetCode problems!**

<br/>

<div align="center">
  <a href="https://suriyas-portfolio.vercel.app/" target="_blank">
    <img src="https://img.shields.io/badge/Check_Out_My_Portfolio-FF0080?style=for-the-badge&logo=vercel&logoColor=white" alt="Portfolio" height="40" />
  </a>
</div>

<br/>

### 🏆 Achievements

- **Full Stack Developer Intern** at **TechnoHacks Edutech** 💼
  - Successfully completed internship focusing on web development and problem solving.

<br/>



### 🛠️ Languages and Tools

<div align="center">
  <img src="https://skillicons.dev/icons?i=html,css,js,react,java,python,c,git,github,vscode,mysql&perline=6" alt="Tech Stack" />
  <br/>
  <!-- Additional Tools like Canva if supported or manually added below -->
  <img src="https://img.shields.io/badge/Canva-%2300C4CC.svg?style=for-the-badge&logo=Canva&logoColor=white" alt="Canva" />
</div>

<br/>

### 📊 GitHub Stats

<div align="center">


  [![LeetCode Stats](https://leetcard.jacoblin.cool/SURIYA0212?theme=radical&font=Fira%20Code&ext=heatmap)](https://leetcode.com/u/SURIYA0212/)

</div>

<br/>

### 📈 Contribution Graph

<div align="center">
  <img src="./profile-3d-contrib/profile-green-animate.svg" alt="3D Graph (Go to Actions Tab -> Run Workflow)" />
</div>

<!-- Fallback 2D Graph if 3D is generating or failed -->
<div align="center">
  <img src="https://github-readme-activity-graph.vercel.app/graph?username=SURIYAPRAKASH0212&bg_color=141321&color=fe428e&line=fe428e&point=fe428e&area=true&hide_border=true" alt="Contribution Graph" />
</div>

<br/>

### 🔗 Connect with Me

<div align="center"> 
  <a href="https://linkedin.com/in/your-linkedin-id" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn" />
  </a>
  <a href="mailto:your-email@example.com">
    <img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Email" />
  </a>
</div>

<br/>

<div align="center">
  <img src="https://komarev.com/ghpvc/?username=SURIYAPRAKASH0212&style=flat-square&color=blueviolet" alt="Profile Views" />
</div>
name: GitHub-Profile-3D-Contrib

on:
  schedule:
    - cron: "0 18 * * *" # Runs daily
  workflow_dispatch: # Allows manual run

jobs:
  build:
    runs-on: ubuntu-latest
    name: generate-github-profile-3d-contrib
    steps:
      - uses: actions/checkout@v3
      - uses: yoshi389111/github-profile-3d-contrib@0.7.1
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
          USERNAME: ${{ github.repository_owner }}
      - name: Commit & Push
        run: |
          git config user.name github-actions
          git config user.email github-actions@github.com
          git add -A .
          git commit -m "generated 3d stats"
          git push
