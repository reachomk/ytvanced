package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* renamed from: afj */
public class afj {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public static final String[] sClassPrefixList = new String[]{"android.widget.", "android.view.", "android.webkit."};
    public static final Map sConstructorMap = new zj();
    public static final Class[] sConstructorSignature = new Class[]{Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = new int[]{16843375};
    public final Object[] mConstructorArgs = new Object[2];

    /* Access modifiers changed, original: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* Access modifiers changed, original: final */
    public final android.view.View createView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
        r0 = this;
        if (r5 != 0) goto L_0x0003;
    L_0x0002:
        goto L_0x000a;
    L_0x0003:
        if (r1 == 0) goto L_0x000a;
    L_0x0005:
        r1 = r1.getContext();
        goto L_0x000b;
    L_0x000a:
        r1 = r3;
    L_0x000b:
        if (r6 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0011;
    L_0x000e:
        if (r7 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0015;
    L_0x0011:
        r1 = defpackage.afj.themifyContext(r1, r4, r6, r7);
    L_0x0015:
        if (r8 == 0) goto L_0x001b;
    L_0x0017:
        r1 = defpackage.arv.a(r1);
    L_0x001b:
        r5 = r2.hashCode();
        switch(r5) {
            case -1946472170: goto L_0x00af;
            case -1455429095: goto L_0x00a4;
            case -1346021293: goto L_0x0099;
            case -938935918: goto L_0x008f;
            case -937446323: goto L_0x0085;
            case -658531749: goto L_0x007a;
            case -339785223: goto L_0x0070;
            case 776382189: goto L_0x0066;
            case 799298502: goto L_0x005b;
            case 1125864064: goto L_0x0051;
            case 1413872058: goto L_0x0045;
            case 1601505219: goto L_0x003a;
            case 1666676343: goto L_0x002f;
            case 2001146706: goto L_0x0024;
            default: goto L_0x0022;
        };
    L_0x0022:
        goto L_0x00ba;
    L_0x0024:
        r5 = "Button";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x002c:
        r5 = 2;
        goto L_0x00bb;
    L_0x002f:
        r5 = "EditText";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x0037:
        r5 = 3;
        goto L_0x00bb;
    L_0x003a:
        r5 = "CheckBox";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x0042:
        r5 = 6;
        goto L_0x00bb;
    L_0x0045:
        r5 = "AutoCompleteTextView";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x004d:
        r5 = 9;
        goto L_0x00bb;
    L_0x0051:
        r5 = "ImageView";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x0059:
        r5 = 1;
        goto L_0x00bb;
    L_0x005b:
        r5 = "ToggleButton";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x0063:
        r5 = 13;
        goto L_0x00bb;
    L_0x0066:
        r5 = "RadioButton";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x006e:
        r5 = 7;
        goto L_0x00bb;
    L_0x0070:
        r5 = "Spinner";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x0078:
        r5 = 4;
        goto L_0x00bb;
    L_0x007a:
        r5 = "SeekBar";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x0082:
        r5 = 12;
        goto L_0x00bb;
    L_0x0085:
        r5 = "ImageButton";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x008d:
        r5 = 5;
        goto L_0x00bb;
    L_0x008f:
        r5 = "TextView";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x0097:
        r5 = 0;
        goto L_0x00bb;
    L_0x0099:
        r5 = "MultiAutoCompleteTextView";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x00a1:
        r5 = 10;
        goto L_0x00bb;
    L_0x00a4:
        r5 = "CheckedTextView";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x00ac:
        r5 = 8;
        goto L_0x00bb;
    L_0x00af:
        r5 = "RatingBar";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00ba;
    L_0x00b7:
        r5 = 11;
        goto L_0x00bb;
    L_0x00ba:
        r5 = -1;
    L_0x00bb:
        switch(r5) {
            case 0: goto L_0x012d;
            case 1: goto L_0x0125;
            case 2: goto L_0x011d;
            case 3: goto L_0x0115;
            case 4: goto L_0x010d;
            case 5: goto L_0x0105;
            case 6: goto L_0x00fd;
            case 7: goto L_0x00f5;
            case 8: goto L_0x00ed;
            case 9: goto L_0x00e5;
            case 10: goto L_0x00dd;
            case 11: goto L_0x00d5;
            case 12: goto L_0x00cd;
            case 13: goto L_0x00c4;
            default: goto L_0x00be;
        };
    L_0x00be:
        r5 = r0.createView(r1, r2, r4);
        goto L_0x0134;
    L_0x00c4:
        r5 = r0.createToggleButton(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x00cd:
        r5 = r0.createSeekBar(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x00d5:
        r5 = r0.createRatingBar(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x00dd:
        r5 = r0.createMultiAutoCompleteTextView(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x00e5:
        r5 = r0.createAutoCompleteTextView(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x00ed:
        r5 = r0.createCheckedTextView(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x00f5:
        r5 = r0.createRadioButton(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x00fd:
        r5 = r0.createCheckBox(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x0105:
        r5 = r0.createImageButton(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x010d:
        r5 = r0.createSpinner(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x0115:
        r5 = r0.createEditText(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x011d:
        r5 = r0.createButton(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x0125:
        r5 = r0.createImageView(r1, r4);
        r0.verifyNotNull(r5, r2);
        goto L_0x0134;
    L_0x012d:
        r5 = r0.createTextView(r1, r4);
        r0.verifyNotNull(r5, r2);
    L_0x0134:
        if (r5 == 0) goto L_0x0137;
    L_0x0136:
        goto L_0x013d;
    L_0x0137:
        if (r3 == r1) goto L_0x013d;
    L_0x0139:
        r5 = r0.createViewFromTag(r1, r2, r4);
    L_0x013d:
        if (r5 == 0) goto L_0x0142;
    L_0x013f:
        r0.checkOnClickListener(r5, r4);
    L_0x0142:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afj.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    /* Access modifiers changed, original: protected */
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public ala createEditText(Context context, AttributeSet attributeSet) {
        return new ala(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    public akx createCheckBox(Context context, AttributeSet attributeSet) {
        return new akx(context, attributeSet);
    }

    public alg createRadioButton(Context context, AttributeSet attributeSet) {
        return new alg(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public akw createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new akw(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public aku createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new aku(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public alf createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new alf(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public alj createRatingBar(Context context, AttributeSet attributeSet) {
        return new alj(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public ali createSeekBar(Context context, AttributeSet attributeSet) {
        return new ali(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public ama createToggleButton(Context context, AttributeSet attributeSet) {
        return new ama(context, attributeSet);
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" asked to inflate view for <");
            stringBuilder.append(str);
            stringBuilder.append(">, but returned null");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        Object[] objArr;
        try {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = context;
            objArr2[1] = attributeSet;
            View view = -1;
            if (str.indexOf(46) == view) {
                for (String createViewByPrefix : sClassPrefixList) {
                    view = createViewByPrefix(context, str, createViewByPrefix);
                    if (view != null) {
                        return view;
                    }
                }
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return null;
            }
            View createViewByPrefix2 = createViewByPrefix(context, str, null);
            objArr = this.mConstructorArgs;
            objArr[0] = null;
            objArr[1] = null;
            return createViewByPrefix2;
        } catch (Exception unused) {
            return null;
        } finally {
            objArr = this.mConstructorArgs;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && abe.I(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new afi(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        Constructor constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    str2 = stringBuilder.toString();
                } catch (Exception unused) {
                    return null;
                }
            }
            str2 = str;
            constructor = Class.forName(str2, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.dp, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(afy.dv, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(afy.dw, 0);
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof ahw) && ((ahw) context).a == resourceId)) ? context : new ahw(context, resourceId);
    }
}
