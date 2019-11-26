package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: afc */
public final class afc {
    public final int a;
    public int b;
    public int c;
    public int d;
    public ViewGroup e;
    public View f;
    public View g;
    public aiw h;
    public ais i;
    public Context j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o = false;
    public boolean p;
    public Bundle q;

    afc(int i) {
        this.a = i;
    }

    /* Access modifiers changed, original: final */
    public final void a(aiw aiw) {
        aiw aiw2 = this.h;
        if (aiw != aiw2) {
            if (aiw2 != null) {
                aiw2.b(this.i);
            }
            this.h = aiw;
            if (aiw != null) {
                ajj ajj = this.i;
                if (ajj != null) {
                    aiw.a(ajj);
                }
            }
        }
    }
}
