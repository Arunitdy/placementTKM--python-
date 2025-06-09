try:
    from OpenGL.GL import *
    from OpenGL.GLUT import *
    from OpenGL.GLU import *
    import numpy as np
    import time
except ModuleNotFoundError:
    print("Error: Required OpenGL libraries are not installed. Please install them using: pip install PyOpenGL PyOpenGL_accelerate")
    import sys
    sys.exit(1)

angle = 0.0 
radius = 50.0
height = 100.0
texture = None

def load_texture():
    global texture
    texture = glGenTextures(1)
    glBindTexture(GL_TEXTURE_2D, texture)
    
    image = np.random.randint(0, 256, (256, 256, 3), dtype=np.uint8)
    glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, 256, 256, 0, GL_RGB, GL_UNSIGNED_BYTE, image)
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR)
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR)

def init():
    if 'glEnable' not in globals():
        print("Error: OpenGL functions are not available. Ensure you have the correct environment setup.")
        sys.exit(1)
    
    glEnable(GL_DEPTH_TEST)
    glEnable(GL_LIGHTING)
    glEnable(GL_LIGHT0)
    glEnable(GL_TEXTURE_2D)
    load_texture()
    
    glLightfv(GL_LIGHT0, GL_POSITION, [1, 1, 1, 0])
    glLightfv(GL_LIGHT0, GL_AMBIENT, [0.2, 0.2, 0.2, 1.0])
    glLightfv(GL_LIGHT0, GL_DIFFUSE, [0.8, 0.8, 0.8, 1.0])
    glLightfv(GL_LIGHT0, GL_SPECULAR, [1.0, 1.0, 1.0, 1.0])

def draw_cylinder():
    global angle
    glPushMatrix()
    glTranslatef(0, 0, 0)
    glRotatef(angle, 0, 0, 1)
    
    quadric = gluNewQuadric()
    gluQuadricTexture(quadric, GL_TRUE)
    gluCylinder(quadric, radius, radius, height, 30, 30)
    
    glPopMatrix()

def display():
    global angle
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    gluLookAt(200, 200, 200, 0, 0, 0, 0, 1, 0)
    
    draw_cylinder()
    glutSwapBuffers()
    angle += 1.0  
    time.sleep(0.01)

def reshape(w, h):
    glViewport(0, 0, w, h)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    gluPerspective(45, max(1, w) / max(1, h), 1, 500)
    glMatrixMode(GL_MODELVIEW)

def main():
    glutInit()
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH)
    glutInitWindowSize(800, 600)
    glutCreateWindow(b'Rolling Cylinder')
    init()
    glutDisplayFunc(display)
    glutIdleFunc(display)
    glutReshapeFunc(reshape)
    glutMainLoop()

if __name__ == "__main__":
    main()
