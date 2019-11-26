package defpackage;

import android.text.TextUtils;
import java.util.Set;

/* renamed from: aenz */
public final class aenz {
    private final afjj a;
    private String b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;

    public final void a() {
        this.b = "";
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = false;
        this.j = false;
    }

    /* synthetic */ aenz(afjj afjj) {
        this.a = (afjj) amqw.a((Object) afjj);
    }

    public final void a(String str, int i, int i2, long j, int i3) {
        if (j > 0) {
            if (!TextUtils.equals(str, this.b)) {
                a();
                this.b = str;
            }
            Set n = aahv.n();
            Integer valueOf = Integer.valueOf(i);
            Object obj = !n.contains(valueOf) ? aahv.h().contains(valueOf) ? 3 : 1 : 2;
            i3--;
            float f;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (!this.i && obj == 3) {
                        this.a.a.a(new aehn());
                        this.i = true;
                    } else if (!this.j && obj == 2) {
                        this.a.a.a(new aehj());
                        this.j = true;
                    }
                    if (obj == 3) {
                        float f2 = this.g;
                        if (f2 < 2.0f) {
                            f2 += ((float) i2) / ((float) j);
                            this.g = f2;
                            if (f2 >= 2.0f) {
                                this.a.a.a(new aeio());
                            }
                        }
                    }
                    if (obj == 2) {
                        f = this.h;
                        if (f < 2.0f) {
                            f += ((float) i2) / ((float) j);
                            this.h = f;
                            if (f >= 2.0f) {
                                this.a.a.a(new aehf());
                            }
                        }
                    }
                } else if (obj == 3) {
                    f = this.e;
                    if (f < 2.0f) {
                        f += ((float) i2) / ((float) j);
                        this.e = f;
                        if (f >= 2.0f) {
                            this.a.a.a(new aeil());
                        }
                    }
                } else if (obj == 2) {
                    f = this.f;
                    if (f < 2.0f) {
                        f += ((float) i2) / ((float) j);
                        this.f = f;
                        if (f >= 2.0f) {
                            this.a.a.a(new aehg());
                        }
                    }
                }
            } else if (obj == 3) {
                f = this.c;
                if (f < 2.0f) {
                    f += ((float) i2) / ((float) j);
                    this.c = f;
                    if (f >= 2.0f) {
                        this.a.a.a(new aein());
                    }
                }
            } else if (obj == 2) {
                f = this.d;
                if (f < 2.0f) {
                    f += ((float) i2) / ((float) j);
                    this.d = f;
                    if (f >= 2.0f) {
                        this.a.a.a(new aehi());
                    }
                }
            }
        }
    }
}
