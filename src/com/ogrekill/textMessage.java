/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ogrekill;

import org.lwjgl.opengl.GL11;

/**
 *
 * @author AhlquistHunter
 */
public class textMessage {
    public void textMessage() { 
       GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex2f(0,0);
            GL11.glVertex2f(800,0);
            GL11.glVertex2f(800,200);
            GL11.glVertex2f(0,200);
    }
}
