package com.google.android.apps.youtube.app.common.player.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.aitq;
import defpackage.aitt;
import defpackage.aiub;
import defpackage.aiuf;
import defpackage.amqw;
import defpackage.ejc;
import defpackage.ejd;
import defpackage.ena;
import defpackage.enc;
import defpackage.enf;
import defpackage.eni;
import defpackage.xpy;
import defpackage.xqs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YouTubePlayerOverlaysLayout extends aiuf implements aitt, ejc, xpy {
    public List a;
    public Map b;
    public ejd c;
    public ViewGroup d;
    public ena e;
    public xqs f;
    private WeakReference j;
    private boolean k;

    public YouTubePlayerOverlaysLayout(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public YouTubePlayerOverlaysLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ViewGroup) findViewById(R.id.player_overlays_custom_views_container);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 1073741824), MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824));
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.k && super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return !this.k && super.dispatchTouchEvent(motionEvent);
    }

    public final void a(View view) {
        if (view != null) {
            this.j = new WeakReference(view);
        } else {
            this.j = null;
        }
        a(this.c);
    }

    /* Access modifiers changed, original: protected|final */
    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.e.b.a(new eni(this)));
        return arrayList;
    }

    public final void a(ejd ejd, ejd ejd2) {
        amqw.a((Object) ejd2);
        if (ejd2 != this.c) {
            this.c = ejd2;
            this.k = ejd2.g();
            a(ejd2);
            b(ejd2);
            if (ejd2.d()) {
                abe.b((View) this, 1);
            } else {
                abe.b((View) this, 2);
                clearFocus();
            }
        }
    }

    private final void a(ejd ejd) {
        if (ejd.g() && !ejd.j()) {
            WeakReference weakReference = this.j;
            if (weakReference != null) {
                this.f.a((View) weakReference.get());
                return;
            }
        }
        if (ejd.f() || ejd.k()) {
            this.f.a(null);
        } else {
            this.f.a((View) this);
        }
    }

    private final void b(ejd ejd) {
        if (ejd != ejd.NONE) {
            int size = this.a.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                aiub aiub = (enc) this.a.get(i2);
                View b = b(aiub);
                if (b == null) {
                    aiub.b(ejd);
                } else {
                    View view = null;
                    while (i < getChildCount()) {
                        view = getChildAt(i);
                        if (this.b.get(view) != null) {
                            break;
                        }
                        i++;
                    }
                    if (this.c.k() || !aiub.a(this.c)) {
                        removeView(b);
                    } else {
                        if (b != view) {
                            addView(b, i, aiub.b());
                        }
                        aiub.b(ejd);
                        i++;
                    }
                }
            }
            bringChildToFront(this.d);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aiub aiub, View view) {
        Object obj;
        if (aiub instanceof enc) {
            obj = (enc) aiub;
        } else {
            obj = new enf(aiub);
        }
        this.a.add(obj);
        if (view != null) {
            this.b.put(view, obj);
        }
    }

    public final void a(aiub... aiubArr) {
        for (aiub aiub : aiubArr) {
            View b = b(aiub);
            aitq c = c(aiub);
            if (b == null && c == null) {
                String valueOf = String.valueOf(aiub);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Overlay ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" does not provide a View");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (c != null) {
                c.a(this);
            }
            a(aiub, b);
        }
        b(this.c);
    }

    public final void a(aitq aitq, View view) {
        int size = this.a.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            aiub aiub = (aiub) this.a.get(i);
            if (aiub == aitq || aiub == a(aiub)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            z = true;
        }
        amqw.b(z);
        this.b.put(view, (enc) this.a.get(i));
        b(this.c);
    }

    private static aiub a(aiub aiub) {
        return aiub instanceof enf ? ((enf) aiub).a : aiub;
    }

    private final View b(aiub aiub) {
        aitq c = c(aiub);
        return (c == null || c.j()) ? aiub.a() : null;
    }

    private static aitq c(aiub aiub) {
        aiub = a(aiub);
        if (aiub instanceof aitq) {
            return (aitq) aiub;
        }
        return null;
    }
}
