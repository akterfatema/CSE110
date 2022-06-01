/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_04;

/**
 *
 * @author Fatema
 */
public class List {

    int Index;
    int MaxSiza;
    private int[] Data = new int[MaxSiza];

    public List() {
        MaxSiza = 10;
        Index = -1;
    }

    public List(int MaxSiza) {
        Index = -1;
        this.MaxSiza = MaxSiza;
    }

    public void setData(int[] Data) {
        this.Data = Data;
    }

    public void push(int data) {

        MaxSiza = MaxSiza + 1;
        for (int i = 0; i < MaxSiza; i++) {

            Data[i] = data;
        }
    }

    public void pop() {
      
        for (int i = 0; i < MaxSiza - 1; i++) {
            Data[i] = Data[i];
        }

    }

    public int top() {
        return Data[MaxSiza];

    }

    public void display() {
        for (int i = 0; i < MaxSiza; i++) {
            System.out.println(Data[i]);
        }
    }

}
