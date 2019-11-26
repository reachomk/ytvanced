package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;

/* renamed from: aimt */
public abstract class aimt implements aiha, ainh {
    private final ScrubbedPreviewView a;
    private final aimu b;
    private final boolean c = true;
    private boolean d;

    public aimt(ScrubbedPreviewView scrubbedPreviewView, aimu aimu) {
        this.a = (ScrubbedPreviewView) amqw.a((Object) scrubbedPreviewView);
        this.b = (aimu) amqw.a((Object) aimu);
        aimu.a((ainh) this);
    }

    public abstract void a(ScrubbedPreviewView scrubbedPreviewView);

    public final void a(int i, long j) {
        if (a()) {
            if (i == 1) {
                a(j);
                a(true);
            } else if (i != 2) {
                a(false);
            } else {
                a(j);
            }
        }
    }

    private final void a(long j) {
        aimu aimu = this.b;
        if (aimu.a() && !aimu.k) {
            aing aing = aimu.h;
            int i = aimu.i;
            aini aini = null;
            if (i >= 0) {
                aini[] ainiArr = aing.a;
                if (i < ainiArr.length) {
                    aini = ainiArr[i];
                }
            }
            if (aini != null) {
                int a = aini.a(j);
                if (a >= 0 && !aimu.l) {
                    aimu.l = true;
                    aimu.a.execute(new ainc(aimu, aini, a));
                }
            }
        }
        this.a.b.setText(aigy.b(j));
        a(this.a);
    }

    public final boolean a() {
        return this.c && this.b.a();
    }

    public final void a(boolean z) {
        if (this.d != z) {
            ainj a;
            this.d = z;
            aimu aimu = this.b;
            synchronized (aimu.j) {
                Bitmap bitmap = aimu.g;
                a = bitmap != null ? ainj.a(bitmap) : null;
            }
            b(a);
        }
    }

    public final void a(ainj ainj) {
        b(ainj);
    }

    private final void b(ainj ainj) {
        if (this.d) {
            ScrubbedPreviewView scrubbedPreviewView = this.a;
            if (!scrubbedPreviewView.d) {
                if (scrubbedPreviewView.c.isStarted()) {
                    scrubbedPreviewView.c.reverse();
                } else {
                    scrubbedPreviewView.c.start();
                }
                scrubbedPreviewView.d = true;
            }
            scrubbedPreviewView.a.setImageBitmap(ainj != null ? ainj.a : null);
            return;
        }
        ScrubbedPreviewView scrubbedPreviewView2 = this.a;
        if (scrubbedPreviewView2.d) {
            scrubbedPreviewView2.c.reverse();
            scrubbedPreviewView2.d = false;
        }
    }
}
