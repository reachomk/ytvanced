package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: cs */
public final class cs extends MarginLayoutParams {
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public boolean K = true;
    public boolean L = true;
    public boolean M = false;
    public boolean N = false;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public float U = 0.5f;
    public dh V = new dh();
    private int W = -1;
    private int X = -1;
    private int Y = 1;
    public int a = -1;
    public int b = -1;
    public float c = -1.0f;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public float u = 0.5f;
    public float v = 0.5f;
    public String w = null;
    public float x = 0.0f;
    public float y = 0.0f;
    public int z = 0;

    public cs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cv.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int resourceId;
            if (index == cv.x) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.d);
                this.d = resourceId;
                if (resourceId == -1) {
                    this.d = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.y) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                if (resourceId == -1) {
                    this.e = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.A) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.f);
                this.f = resourceId;
                if (resourceId == -1) {
                    this.f = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.B) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.g);
                this.g = resourceId;
                if (resourceId == -1) {
                    this.g = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.G) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.h);
                this.h = resourceId;
                if (resourceId == -1) {
                    this.h = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.F) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.i);
                this.i = resourceId;
                if (resourceId == -1) {
                    this.i = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.j) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                this.j = resourceId;
                if (resourceId == -1) {
                    this.j = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.i) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.k);
                this.k = resourceId;
                if (resourceId == -1) {
                    this.k = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.h) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.l);
                this.l = resourceId;
                if (resourceId == -1) {
                    this.l = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.N) {
                this.H = obtainStyledAttributes.getDimensionPixelOffset(index, this.H);
            } else if (index == cv.O) {
                this.I = obtainStyledAttributes.getDimensionPixelOffset(index, this.I);
            } else if (index == cv.n) {
                this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
            } else if (index == cv.o) {
                this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
            } else if (index == cv.p) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == cv.f) {
                this.J = obtainStyledAttributes.getInt(index, this.J);
            } else if (index == cv.C) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                this.m = resourceId;
                if (resourceId == -1) {
                    this.m = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.D) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.n);
                this.n = resourceId;
                if (resourceId == -1) {
                    this.n = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.m) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.o);
                this.o = resourceId;
                if (resourceId == -1) {
                    this.o = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.l) {
                resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                this.p = resourceId;
                if (resourceId == -1) {
                    this.p = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == cv.R) {
                this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
            } else if (index == cv.U) {
                this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
            } else if (index == cv.S) {
                this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
            } else if (index == cv.P) {
                this.r = obtainStyledAttributes.getDimensionPixelSize(index, this.r);
            } else if (index == cv.T) {
                this.s = obtainStyledAttributes.getDimensionPixelSize(index, this.s);
            } else if (index == cv.Q) {
                this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
            } else if (index == cv.t) {
                this.u = obtainStyledAttributes.getFloat(index, this.u);
            } else if (index == cv.H) {
                this.v = obtainStyledAttributes.getFloat(index, this.v);
            } else if (index == cv.k) {
                this.w = obtainStyledAttributes.getString(index);
                this.Y = -1;
                String str = this.w;
                if (str != null) {
                    index = str.length();
                    resourceId = this.w.indexOf(44);
                    if (resourceId <= 0 || resourceId >= index - 1) {
                        resourceId = 0;
                    } else {
                        String substring = this.w.substring(0, resourceId);
                        if (substring.equalsIgnoreCase("W")) {
                            this.Y = 0;
                        } else if (substring.equalsIgnoreCase("H")) {
                            this.Y = 1;
                        }
                        resourceId++;
                    }
                    int indexOf = this.w.indexOf(58);
                    if (indexOf >= 0 && indexOf < index - 1) {
                        str = this.w.substring(resourceId, indexOf);
                        String substring2 = this.w.substring(indexOf + 1);
                        if (str.length() > 0 && substring2.length() > 0) {
                            try {
                                float parseFloat = Float.parseFloat(str);
                                float parseFloat2 = Float.parseFloat(substring2);
                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                    if (this.Y == 1) {
                                        Math.abs(parseFloat2 / parseFloat);
                                    } else {
                                        Math.abs(parseFloat / parseFloat2);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    } else {
                        str = this.w.substring(resourceId);
                        if (str.length() > 0) {
                            Float.parseFloat(str);
                        }
                    }
                }
            } else if (index == cv.v) {
                this.x = obtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == cv.J) {
                this.y = obtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == cv.u) {
                this.z = obtainStyledAttributes.getInt(index, 0);
            } else if (index == cv.I) {
                this.A = obtainStyledAttributes.getInt(index, 0);
            } else if (index == cv.K) {
                this.B = obtainStyledAttributes.getInt(index, 0);
            } else if (index == cv.q) {
                this.C = obtainStyledAttributes.getInt(index, 0);
            } else if (index == cv.M) {
                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
            } else if (index == cv.L) {
                this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
            } else if (index == cv.s) {
                this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
            } else if (index == cv.r) {
                this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
            } else if (!(index == cv.w || index == cv.E)) {
                index = cv.z;
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.N = false;
        this.K = true;
        this.L = true;
        if (this.width == 0 || this.width == -1) {
            this.K = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.L = false;
        }
        if (this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.N = true;
            this.K = true;
            this.L = true;
            if (!(this.V instanceof dj)) {
                this.V = new dj();
            }
            ((dj) this.V).h(this.J);
        }
    }

    public cs() {
        super(-2, -2);
    }

    public cs(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public final void resolveLayoutDirection(int i) {
        int i2;
        super.resolveLayoutDirection(i);
        this.Q = -1;
        this.R = -1;
        this.O = -1;
        this.P = -1;
        this.S = -1;
        this.T = -1;
        this.S = this.W;
        this.T = this.X;
        this.U = this.u;
        if (getLayoutDirection() == 1) {
            i2 = this.m;
            if (i2 != -1) {
                this.Q = i2;
            } else {
                i2 = this.n;
                if (i2 != -1) {
                    this.R = i2;
                }
            }
            i2 = this.o;
            if (i2 != -1) {
                this.P = i2;
            }
            i2 = this.p;
            if (i2 != -1) {
                this.O = i2;
            }
            i2 = this.s;
            if (i2 != -1) {
                this.T = i2;
            }
            i2 = this.t;
            if (i2 != -1) {
                this.S = i2;
            }
            this.U = 1.0f - this.u;
        } else {
            i2 = this.m;
            if (i2 != -1) {
                this.P = i2;
            }
            i2 = this.n;
            if (i2 != -1) {
                this.O = i2;
            }
            i2 = this.o;
            if (i2 != -1) {
                this.Q = i2;
            }
            i2 = this.p;
            if (i2 != -1) {
                this.R = i2;
            }
            i2 = this.s;
            if (i2 != -1) {
                this.S = i2;
            }
            i2 = this.t;
            if (i2 != -1) {
                this.T = i2;
            }
        }
        if (this.o == -1 && this.p == -1) {
            i2 = this.f;
            if (i2 != -1) {
                this.Q = i2;
            } else {
                i2 = this.g;
                if (i2 != -1) {
                    this.R = i2;
                }
            }
        }
        if (this.n == -1 && this.m == -1) {
            i2 = this.d;
            if (i2 != -1) {
                this.O = i2;
                return;
            }
            i2 = this.e;
            if (i2 != -1) {
                this.P = i2;
            }
        }
    }
}
