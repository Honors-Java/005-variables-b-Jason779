
int var1 = random(25, 400);
int var2 = random(25, 400);
int var3 = random(25, 400);
int var4 = random(25, 400);

int r1 = random(1,255);
int g1 = random(1,255);
int b1 = random(1,255);

void setup() {
	size(500, 500);
  rect(CENTER);
  ellipseMode(CENTER);
  rectMode(CENTER);
  frameRate(30);
}

void mousePressed(){
fill(random(0,255), random(0,255), random(0,255));
rect(random(0,500), random(0,500), random(200,300), random(200,300));
}

void draw() {


println(mouseX, mouseY);

// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

//These are the ellipses
fill(random(0,255), random(0,255), random(0,255));
ellipse(mouseX - random(-30,30), mouseY - random(-30,30), 10, 10)
fill(r1, g1, b1);
rect(var1, var2, var3, var4);


}

void mousePressed(){
fill(random(0,255), random(0,255), random(0,255));

background(250);
var1 = random(0, 500);
var2 = random(0, 500);
var3 = random(50, 400);
var4 = random(50, 400);

r1 = random(1,255);
g1 = random(1,255);
b1 = random(1,255);
}

