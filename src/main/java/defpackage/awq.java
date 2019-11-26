package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: awq */
public final class awq {
    public static final Object a = new Object();
    public static volatile awq b;
    public final awt c;
    public final awz d;
    public final boolean e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final int i;
    private final ReadWriteLock j = new ReentrantReadWriteLock();
    private final Set k;
    private int l = 3;
    private final Handler m;
    private final int n;

    public awq(awu awu) {
        this.e = awu.b;
        this.f = false;
        this.g = null;
        this.h = false;
        this.i = awu.d;
        this.d = awu.a;
        this.n = 0;
        this.m = new Handler(Looper.getMainLooper());
        this.k = new zl();
        Set set = awu.c;
        if (!(set == null || set.isEmpty())) {
            this.k.addAll(awu.c);
        }
        this.c = new aws(this);
        this.j.writeLock().lock();
        try {
            this.l = 0;
            if (c() == 0) {
                this.c.a();
            }
        } finally {
            this.j.writeLock().unlock();
        }
    }

    public static awq a() {
        awq awq;
        synchronized (a) {
            aad.a(b != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            awq = b;
        }
        return awq;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        Collection arrayList = new ArrayList();
        this.j.writeLock().lock();
        try {
            this.l = 1;
            arrayList.addAll(this.k);
            this.k.clear();
            this.m.post(new aww(arrayList, this.l));
        } finally {
            this.j.writeLock().unlock();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Throwable th) {
        Collection arrayList = new ArrayList();
        this.j.writeLock().lock();
        try {
            this.l = 2;
            arrayList.addAll(this.k);
            this.k.clear();
            this.m.post(new aww(arrayList, this.l, (byte) 0));
        } finally {
            this.j.writeLock().unlock();
        }
    }

    public final void a(awx awx) {
        aad.a((Object) awx, (Object) "initCallback cannot be null");
        this.j.writeLock().lock();
        try {
            int i = this.l;
            if (i != 1) {
                if (i != 2) {
                    this.k.add(awx);
                    this.j.writeLock().unlock();
                }
            }
            this.m.post(new aww(awx, i));
            this.j.writeLock().unlock();
        } catch (Throwable th) {
            this.j.writeLock().unlock();
        }
    }

    public final int c() {
        this.j.readLock().lock();
        try {
            int i = this.l;
            return i;
        } finally {
            this.j.readLock().unlock();
        }
    }

    public final boolean d() {
        return c() == 1;
    }

    public static boolean a(Editable editable, int i, KeyEvent keyEvent) {
        boolean a;
        if (i != 67) {
            if (i == 112) {
                a = axd.a(editable, keyEvent, true);
            }
            return false;
        }
        a = axd.a(editable, keyEvent, false);
        if (a) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    public static boolean a(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
        r0 = 1;
        r1 = 0;
        if (r8 != 0) goto L_0x0006;
    L_0x0004:
        goto L_0x00ef;
    L_0x0006:
        if (r9 >= 0) goto L_0x000a;
    L_0x0008:
        goto L_0x00ef;
    L_0x000a:
        if (r10 < 0) goto L_0x00ef;
    L_0x000c:
        r2 = android.text.Selection.getSelectionStart(r8);
        r3 = android.text.Selection.getSelectionEnd(r8);
        r4 = defpackage.axd.a(r2, r3);
        if (r4 != 0) goto L_0x00ef;
    L_0x001a:
        if (r11 != 0) goto L_0x002c;
    L_0x001c:
        r2 = r2 - r9;
        r9 = java.lang.Math.max(r2, r1);
        r3 = r3 + r10;
        r10 = r8.length();
        r10 = java.lang.Math.min(r3, r10);
        goto L_0x00b2;
    L_0x002c:
        r9 = java.lang.Math.max(r9, r1);
        r11 = r8.length();
        r4 = -1;
        if (r2 >= 0) goto L_0x0039;
    L_0x0037:
        r9 = -1;
        goto L_0x006b;
    L_0x0039:
        if (r11 < r2) goto L_0x0037;
    L_0x003b:
        if (r9 < 0) goto L_0x0037;
    L_0x003d:
        r11 = 0;
    L_0x003e:
        if (r9 == 0) goto L_0x006a;
    L_0x0040:
        r2 = r2 + -1;
        if (r2 >= 0) goto L_0x0049;
    L_0x0044:
        if (r11 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0037;
    L_0x0047:
        r9 = 0;
        goto L_0x006b;
    L_0x0049:
        r5 = r8.charAt(r2);
        if (r11 == 0) goto L_0x0058;
    L_0x004f:
        r11 = java.lang.Character.isHighSurrogate(r5);
        if (r11 == 0) goto L_0x0037;
    L_0x0055:
        r9 = r9 + -1;
        goto L_0x003d;
    L_0x0058:
        r6 = java.lang.Character.isSurrogate(r5);
        if (r6 != 0) goto L_0x0061;
    L_0x005e:
        r9 = r9 + -1;
        goto L_0x003e;
    L_0x0061:
        r11 = java.lang.Character.isHighSurrogate(r5);
        if (r11 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0037;
    L_0x0068:
        r11 = 1;
        goto L_0x003e;
    L_0x006a:
        r9 = r2;
    L_0x006b:
        r10 = java.lang.Math.max(r10, r1);
        r11 = r8.length();
        if (r3 >= 0) goto L_0x0077;
    L_0x0075:
        r10 = -1;
        goto L_0x00ad;
    L_0x0077:
        if (r11 >= r3) goto L_0x007a;
    L_0x0079:
        goto L_0x0075;
    L_0x007a:
        if (r10 < 0) goto L_0x0075;
    L_0x007c:
        r2 = 0;
    L_0x007d:
        if (r10 != 0) goto L_0x0081;
    L_0x007f:
        r10 = r3;
        goto L_0x00ad;
    L_0x0081:
        if (r3 >= r11) goto L_0x00a9;
    L_0x0083:
        r5 = r8.charAt(r3);
        if (r2 == 0) goto L_0x0094;
    L_0x0089:
        r2 = java.lang.Character.isLowSurrogate(r5);
        if (r2 == 0) goto L_0x0075;
    L_0x008f:
        r10 = r10 + -1;
        r3 = r3 + 1;
        goto L_0x007c;
    L_0x0094:
        r6 = java.lang.Character.isSurrogate(r5);
        if (r6 != 0) goto L_0x009f;
    L_0x009a:
        r10 = r10 + -1;
        r3 = r3 + 1;
        goto L_0x007d;
    L_0x009f:
        r2 = java.lang.Character.isLowSurrogate(r5);
        if (r2 != 0) goto L_0x0075;
    L_0x00a5:
        r3 = r3 + 1;
        r2 = 1;
        goto L_0x007d;
    L_0x00a9:
        if (r2 == 0) goto L_0x00ac;
    L_0x00ab:
        goto L_0x0075;
    L_0x00ac:
        r10 = r11;
    L_0x00ad:
        if (r9 != r4) goto L_0x00b0;
    L_0x00af:
        goto L_0x00ef;
    L_0x00b0:
        if (r10 == r4) goto L_0x00ef;
    L_0x00b2:
        r11 = defpackage.axe.class;
        r11 = r8.getSpans(r9, r10, r11);
        r11 = (defpackage.axe[]) r11;
        if (r11 == 0) goto L_0x00ef;
    L_0x00bc:
        r2 = r11.length;
        if (r2 <= 0) goto L_0x00ef;
    L_0x00bf:
        r3 = r10;
        r10 = r9;
        r9 = 0;
    L_0x00c2:
        if (r9 >= r2) goto L_0x00d9;
    L_0x00c4:
        r4 = r11[r9];
        r5 = r8.getSpanStart(r4);
        r4 = r8.getSpanEnd(r4);
        r10 = java.lang.Math.min(r5, r10);
        r3 = java.lang.Math.max(r4, r3);
        r9 = r9 + 1;
        goto L_0x00c2;
    L_0x00d9:
        r9 = java.lang.Math.max(r10, r1);
        r10 = r8.length();
        r10 = java.lang.Math.min(r3, r10);
        r7.beginBatchEdit();
        r8.delete(r9, r10);
        r7.endBatchEdit();
        r1 = 1;
    L_0x00ef:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awq.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public final CharSequence a(CharSequence charSequence) {
        return a(charSequence, charSequence != null ? charSequence.length() : 0);
    }

    public final CharSequence a(CharSequence charSequence, int i) {
        return a(charSequence, 0, i, Integer.MAX_VALUE);
    }

    public final CharSequence a(CharSequence charSequence, int i, int i2, int i3) {
        aad.a(d(), "Not initialized yet");
        aad.a(i, "start cannot be negative");
        aad.a(i2, "end cannot be negative");
        aad.a(i3, "maxEmojiCount cannot be negative");
        boolean z = true;
        aad.a(i <= i2, (Object) "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        aad.a(i <= charSequence.length(), (Object) "start should be < than charSequence length");
        if (i2 > charSequence.length()) {
            z = false;
        }
        aad.a(z, (Object) "end should be < than charSequence length");
        if (!(charSequence.length() == 0 || i == i2)) {
            charSequence = this.c.a(charSequence, i, i2, i3, this.e);
        }
        return charSequence;
    }
}
