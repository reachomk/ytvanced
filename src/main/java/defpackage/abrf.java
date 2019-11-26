package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: abrf */
public final class abrf implements akto {
    public final akvz a;
    public final akti b;
    public abug c;
    public boolean d;
    public ViewGroup e;
    public boolean f;
    private final abum g;
    private final akth h;
    private final SpannableStringBuilder i = new SpannableStringBuilder();
    private final ArrayList j = new ArrayList();
    private final abru k;
    private TextWatcher l;
    private EditText m;

    public abrf(Context context, abum abum, akvz akvz, akti akti, akvp akvp, aktl aktl, abru abru) {
        this.g = abum;
        this.b = akti;
        this.k = abru;
        this.a = akvz;
        this.a.a(ajxa.class);
        this.h = new akth(context, akvp, aktl, true, this, true);
    }

    private static int a(int i, int i2) {
        return i >= i2 ? 0 : i2 - i;
    }

    public final TextWatcher a(EditText editText) {
        this.m = editText;
        if (this.l == null) {
            this.l = new abrg(this, editText);
        }
        return this.l;
    }

    public final void a(ViewGroup viewGroup, arec arec, EditText editText, abun abun) {
        this.m = editText;
        editText.setOnTouchListener(new abre(this, abun));
        if (arec != null) {
            this.e = (ViewGroup) viewGroup.findViewById(R.id.emoji_picker);
            if (this.e == null) {
                ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.emoji_picker_stub);
                viewStub.setLayoutResource(this.k.a(5));
                viewStub.inflate();
                this.e = (ViewGroup) viewGroup.findViewById(R.id.emoji_picker);
            }
            this.c = this.g.a(this.e);
            abug abug = this.c;
            abug.b = editText;
            abug.a = abun;
            akor akor = new akor();
            akor.a("VIEW_POOL_KEY", (akpb) this.a.get());
            akor.a("CONTROLLER_KEY", (Object) this);
            this.c.a_(akor, arec);
            xpr.a(this.e);
            this.e.setVisibility(0);
            this.d = true;
            return;
        }
        a();
    }

    public final void a() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.d = false;
    }

    public final void a(String str) {
        this.i.clear();
        this.h.a();
        akth akth = this.h;
        akti akti = this.b;
        String str2 = (akti.a.get(str) == null || ((ardw) akti.a.get(str)).c.size() <= 0 || TextUtils.isEmpty((String) ((ardw) akti.a.get(str)).c.get(0))) ? " " : (String) ((ardw) akti.a.get(str)).c.get(0);
        akth.a(str2, this.b.a(str), (float) this.m.getLineHeight(), (Object) str, this.m.getId(), this.i, null);
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        EditText editText = this.m;
        if (editText != null) {
            editText.getEditableText().insert(this.m.getSelectionEnd(), spannableStringBuilder);
        }
    }

    private static String a(String str, int i, int i2) {
        return i >= i2 ? "" : str.substring(i, i2);
    }

    private final void a(Editable editable, int i, int i2) {
        char[] cArr = new char[Math.abs(i2 - i)];
        int i3 = 0;
        editable.getChars(i, i2, cArr, 0);
        String trim = new String(cArr).trim();
        if (!TextUtils.isEmpty(trim)) {
            Pattern b = this.b.b();
            if (b != null) {
                Matcher matcher = b.matcher(trim);
                int length = trim.length();
                i2 = 0;
                while (matcher.find()) {
                    if (matcher.start() <= i2) {
                        augm augm = (augm) augn.c.createBuilder();
                        augm.a(abrf.a(trim, i2, matcher.start()));
                        augm.build();
                    } else {
                        augm augm2 = (augm) augn.c.createBuilder();
                        if (i3 != 0) {
                            augm2.a(abrf.a(trim, length, matcher.start()));
                        } else {
                            augm2.a(abrf.a(trim, i2, matcher.start()));
                        }
                        this.j.add((augn) ((anxl) augm2.build()));
                        i2 = matcher.start();
                    }
                    c(this.b.b(matcher.group()));
                    length = matcher.end();
                    i3 = 1;
                }
                if (i3 == 0) {
                    b(trim);
                } else if (length < trim.length()) {
                    b(abrf.a(trim, length, trim.length()));
                }
            }
        }
    }

    private final void b(String str) {
        augm augm = (augm) augn.c.createBuilder();
        augm.a(str);
        this.j.add((augn) ((anxl) augm.build()));
    }

    private final void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            augm augm = (augm) augn.c.createBuilder();
            augm.copyOnWrite();
            augn augn = (augn) augm.instance;
            if (str != null) {
                augn.a = 2;
                augn.b = str;
                this.j.add((augn) ((anxl) augm.build()));
                return;
            }
            throw new NullPointerException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    public final defpackage.augl a(android.text.Editable r10) {
        /*
        r9 = this;
        r0 = defpackage.augl.d;
        r0 = r0.createBuilder();
        r0 = (defpackage.augk) r0;
        r1 = r9.e;
        if (r1 == 0) goto L_0x0022;
    L_0x000c:
        r1 = defpackage.abe.g(r1);
        r2 = 1;
        if (r1 == r2) goto L_0x0014;
    L_0x0013:
        goto L_0x0022;
    L_0x0014:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.augl) r1;
        r3 = r1.a;
        r3 = r3 | r2;
        r1.a = r3;
        r1.c = r2;
    L_0x0022:
        r1 = r9.j;
        r1.clear();
        r1 = r10.length();
        r2 = android.text.style.ImageSpan.class;
        r3 = 0;
        r1 = r10.getSpans(r3, r1, r2);
        r1 = (android.text.style.ImageSpan[]) r1;
        r2 = r9.b;
        r2 = r2.a();
        if (r2 == 0) goto L_0x0085;
    L_0x003c:
        r2 = r1.length;
        if (r2 <= 0) goto L_0x0085;
    L_0x003f:
        r4 = new abrh;
        r4.<init>(r10);
        java.util.Arrays.sort(r1, r4);
        r4 = 0;
        r5 = 0;
    L_0x0049:
        if (r4 >= r2) goto L_0x0077;
    L_0x004b:
        r6 = r1[r4];
        r7 = r10.getSpanStart(r6);
        if (r7 <= r5) goto L_0x0056;
    L_0x0053:
        r9.a(r10, r5, r7);
    L_0x0056:
        r5 = r10.getSpanEnd(r6);
        if (r5 <= r7) goto L_0x0074;
    L_0x005c:
        r6 = r5 - r7;
        r6 = new char[r6];
        r10.getChars(r7, r5, r6, r3);
        r7 = r6.length;
        if (r7 <= 0) goto L_0x0074;
    L_0x0066:
        r7 = r9.b;
        r8 = new java.lang.String;
        r8.<init>(r6);
        r6 = r7.b(r8);
        r9.c(r6);
    L_0x0074:
        r4 = r4 + 1;
        goto L_0x0049;
    L_0x0077:
        r1 = r10.length();
        if (r5 == r1) goto L_0x008c;
    L_0x007d:
        r1 = r10.length();
        r9.a(r10, r5, r1);
        goto L_0x008c;
    L_0x0085:
        r1 = r10.length();
        r9.a(r10, r3, r1);
    L_0x008c:
        r10 = r9.j;
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.augl) r1;
        r2 = r1.b;
        r2 = r2.a();
        if (r2 != 0) goto L_0x00a5;
    L_0x009d:
        r2 = r1.b;
        r2 = defpackage.anxl.mutableCopy(r2);
        r1.b = r2;
    L_0x00a5:
        r1 = r1.b;
        defpackage.anvf.addAll(r10, r1);
        r10 = r0.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.augl) r10;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abrf.a(android.text.Editable):augl");
    }

    public final int a(CharSequence charSequence, int i) {
        String trim = charSequence.toString().trim();
        if (TextUtils.isEmpty(trim) || !this.b.a() || i <= 0) {
            return trim.length();
        }
        Matcher matcher = this.b.b().matcher(trim);
        Object obj = null;
        int length = trim.length();
        int i2 = 0;
        int i3 = 0;
        while (matcher.find()) {
            if (matcher.start() <= i2) {
                i3 += abrf.a(i2, matcher.start());
            } else {
                if (obj != null) {
                    i2 = abrf.a(length, matcher.start());
                } else {
                    i2 = abrf.a(i2, matcher.start());
                }
                i3 += i2;
                i2 = matcher.start();
            }
            i3 += i;
            length = matcher.end();
            obj = 1;
        }
        if (obj == null) {
            i3 = trim.length();
        } else if (length < trim.length()) {
            return i3 + abrf.a(length, trim.length());
        }
        return i3;
    }
}
