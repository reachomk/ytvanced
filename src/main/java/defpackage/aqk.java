package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: aqk */
public final class aqk {
    private static final Mode a = Mode.SRC_IN;
    private static aqk b;
    private static final aqp c = new aqp();
    private WeakHashMap d;
    private zj e;
    private aaf f;
    private final WeakHashMap g = new WeakHashMap(0);
    private TypedValue h;
    private boolean i;
    private aqr j;

    public static synchronized aqk a() {
        aqk aqk;
        synchronized (aqk.class) {
            if (b == null) {
                aqk = new aqk();
                b = aqk;
                if (VERSION.SDK_INT < 24) {
                    aqk.a("vector", new aqq());
                    aqk.a("animated-vector", new aqm());
                    aqk.a("animated-selector", new aqn());
                }
            }
            aqk = b;
        }
        return aqk;
    }

    public final synchronized void a(aqr aqr) {
        this.j = aqr;
    }

    public final synchronized Drawable a(Context context, int i) {
        return a(context, i, false);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Drawable a(Context context, int i, boolean z) {
        Drawable a;
        Drawable a2;
        if (!this.i) {
            this.i = true;
            a2 = a(context, (int) R.drawable.abc_vector_test);
            if (a2 != null) {
                if (!(a2 instanceof lz)) {
                    if ("android.graphics.drawable.VectorDrawable".equals(a2.getClass().getName())) {
                    }
                }
            }
            this.i = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        a2 = c(context, i);
        if (a2 == null) {
            if (this.h == null) {
                this.h = new TypedValue();
            }
            TypedValue typedValue = this.h;
            context.getResources().getValue(i, typedValue, true);
            long a3 = aqk.a(typedValue);
            a = a(context, a3);
            if (a == null) {
                aqr aqr = this.j;
                a = aqr != null ? aqr.a(this, context, i) : null;
                if (a != null) {
                    a.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, a3, a);
                }
            }
        } else {
            a = a2;
        }
        if (a == null) {
            a = ra.a(context, i);
        }
        if (a != null) {
            a = a(context, i, z, a);
        }
        if (a != null) {
            amu.b(a);
        }
        return a;
    }

    public final synchronized void a(Context context) {
        zr zrVar = (zr) this.g.get(context);
        if (zrVar != null) {
            zrVar.c();
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private final Drawable a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = b(context, i);
        Mode mode = null;
        if (b != null) {
            if (amu.c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = st.d(drawable);
            st.a(drawable, b);
            aqr aqr = this.j;
            if (aqr != null) {
                mode = aqr.a(i);
            }
            if (mode != null) {
                st.a(drawable, mode);
                return drawable;
            }
        }
        aqr aqr2 = this.j;
        if ((aqr2 == null || !aqr2.a(context, i, drawable)) && !a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private final Drawable c(Context context, int i) {
        zj zjVar = this.e;
        if (zjVar == null || zjVar.isEmpty()) {
            return null;
        }
        aaf aaf = this.f;
        String str = "appcompat_skip_skip";
        if (aaf != null) {
            String str2 = (String) aaf.a(i);
            if (str.equals(str2) || (str2 != null && this.e.get(str2) == null)) {
                return null;
            }
        }
        this.f = new aaf();
        if (this.h == null) {
            this.h = new TypedValue();
        }
        TypedValue typedValue = this.h;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = aqk.a(typedValue);
        Drawable a2 = a(context, a);
        if (a2 == null) {
            if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    while (true) {
                        int next = xml.next();
                        if (next == 2) {
                            String name = xml.getName();
                            this.f.c(i, name);
                            aqo aqo = (aqo) this.e.get(name);
                            if (aqo != null) {
                                a2 = aqo.a(context, xml, asAttributeSet, context.getTheme());
                            }
                            if (a2 != null) {
                                a2.setChangingConfigurations(typedValue.changingConfigurations);
                                a(context, a, a2);
                            }
                        } else if (next == 1) {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                } catch (Exception e) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
                }
            }
            if (a2 == null) {
                this.f.c(i, str);
            }
        }
        return a2;
    }

    /* JADX WARNING: Missing block: B:13:0x002b, code skipped:
            return null;
     */
    private final synchronized android.graphics.drawable.Drawable a(android.content.Context r4, long r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.g;	 Catch:{ all -> 0x002e }
        r0 = r0.get(r4);	 Catch:{ all -> 0x002e }
        r0 = (defpackage.zr) r0;	 Catch:{ all -> 0x002e }
        r1 = 0;
        if (r0 == 0) goto L_0x002c;
    L_0x000c:
        r2 = r0.a(r5);	 Catch:{ all -> 0x002e }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x002e }
        if (r2 == 0) goto L_0x002a;
    L_0x0014:
        r2 = r2.get();	 Catch:{ all -> 0x002e }
        r2 = (android.graphics.drawable.Drawable.ConstantState) r2;	 Catch:{ all -> 0x002e }
        if (r2 != 0) goto L_0x0020;
    L_0x001c:
        r0.b(r5);	 Catch:{ all -> 0x002e }
        goto L_0x002a;
    L_0x0020:
        r4 = r4.getResources();	 Catch:{ all -> 0x002e }
        r4 = r2.newDrawable(r4);	 Catch:{ all -> 0x002e }
        monitor-exit(r3);
        return r4;
    L_0x002a:
        monitor-exit(r3);
        return r1;
    L_0x002c:
        monitor-exit(r3);
        return r1;
    L_0x002e:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqk.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private final synchronized boolean a(Context context, long j, Drawable drawable) {
        boolean z;
        ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            zr zrVar = (zr) this.g.get(context);
            if (zrVar == null) {
                zrVar = new zr();
                this.g.put(context, zrVar);
            }
            zrVar.b(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Drawable a(Context context, asr asr, int i) {
        Drawable c = c(context, i);
        if (c == null) {
            c = asr.a(i);
        }
        if (c == null) {
            return null;
        }
        return a(context, i, false, c);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(Context context, int i, Drawable drawable) {
        aqr aqr = this.j;
        return aqr != null && aqr.b(context, i, drawable);
    }

    private final void a(String str, aqo aqo) {
        if (this.e == null) {
            this.e = new zj();
        }
        this.e.put(str, aqo);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARNING: Missing block: B:24:0x0048, code skipped:
            return r0;
     */
    public final synchronized android.content.res.ColorStateList b(android.content.Context r4, int r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d;	 Catch:{ all -> 0x0049 }
        r1 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x0006:
        r0 = r0.get(r4);	 Catch:{ all -> 0x0049 }
        r0 = (defpackage.aaf) r0;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0015;
    L_0x000e:
        r0 = r0.a(r5);	 Catch:{ all -> 0x0049 }
        r0 = (android.content.res.ColorStateList) r0;	 Catch:{ all -> 0x0049 }
        goto L_0x0016;
    L_0x0015:
        r0 = r1;
    L_0x0016:
        if (r0 != 0) goto L_0x0047;
    L_0x0018:
        r0 = r3.j;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0020;
    L_0x001c:
        r1 = r0.a(r4, r5);	 Catch:{ all -> 0x0049 }
    L_0x0020:
        r0 = r1;
        if (r0 == 0) goto L_0x0047;
    L_0x0023:
        r1 = r3.d;	 Catch:{ all -> 0x0049 }
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = new java.util.WeakHashMap;	 Catch:{ all -> 0x0049 }
        r1.<init>();	 Catch:{ all -> 0x0049 }
        r3.d = r1;	 Catch:{ all -> 0x0049 }
    L_0x002e:
        r1 = r3.d;	 Catch:{ all -> 0x0049 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x0049 }
        r1 = (defpackage.aaf) r1;	 Catch:{ all -> 0x0049 }
        if (r1 != 0) goto L_0x0042;
    L_0x0038:
        r1 = new aaf;	 Catch:{ all -> 0x0049 }
        r1.<init>();	 Catch:{ all -> 0x0049 }
        r2 = r3.d;	 Catch:{ all -> 0x0049 }
        r2.put(r4, r1);	 Catch:{ all -> 0x0049 }
    L_0x0042:
        r1.c(r5, r0);	 Catch:{ all -> 0x0049 }
        monitor-exit(r3);
        return r0;
    L_0x0047:
        monitor-exit(r3);
        return r0;
    L_0x0049:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqk.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    static void a(android.graphics.drawable.Drawable r3, defpackage.ary r4, int[] r5) {
        /*
        r0 = defpackage.amu.c(r3);
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = r3.mutate();
        if (r0 != r3) goto L_0x000d;
    L_0x000c:
        goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r4.d;
        r1 = 0;
        if (r0 != 0) goto L_0x001d;
    L_0x0013:
        r0 = r4.c;
        if (r0 != 0) goto L_0x001b;
    L_0x0017:
        r3.clearColorFilter();
        goto L_0x003a;
    L_0x001b:
        r0 = r1;
        goto L_0x001f;
    L_0x001d:
        r0 = r4.a;
    L_0x001f:
        r2 = r4.c;
        if (r2 != 0) goto L_0x0026;
    L_0x0023:
        r4 = a;
        goto L_0x0028;
    L_0x0026:
        r4 = r4.b;
    L_0x0028:
        if (r0 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x0037;
    L_0x002b:
        if (r4 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0037;
    L_0x002e:
        r1 = 0;
        r5 = r0.getColorForState(r5, r1);
        r1 = defpackage.aqk.a(r5, r4);
    L_0x0037:
        r3.setColorFilter(r1);
    L_0x003a:
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 23;
        if (r4 > r5) goto L_0x0043;
    L_0x0040:
        r3.invalidateSelf();
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqk.a(android.graphics.drawable.Drawable, ary, int[]):void");
    }

    public static synchronized PorterDuffColorFilter a(int i, Mode mode) {
        synchronized (aqk.class) {
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) c.a(Integer.valueOf(aqp.a(i, mode)));
            if (porterDuffColorFilter != null) {
                return porterDuffColorFilter;
            }
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            c.a(Integer.valueOf(aqp.a(i, mode)), porterDuffColorFilter);
            return porterDuffColorFilter;
        }
    }
}
