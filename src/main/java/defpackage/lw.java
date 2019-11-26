package defpackage;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: lw */
public final class lw {
    public static Animator a(Context context, Resources resources, Theme theme, int i) {
        StringBuilder stringBuilder;
        NotFoundException notFoundException;
        String str = "Can't load animation resource ID #0x";
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a = lw.a(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e2);
            throw notFoundException;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        TypedValue peekValue = typedArray.peekValue(i2);
        Object obj = peekValue == null ? null : 1;
        int i5 = obj != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        Object obj2 = peekValue2 == null ? null : 1;
        if (obj2 != null) {
            i4 = peekValue2.type;
        } else {
            i4 = 0;
        }
        if (i == 4) {
            i = ((obj == null || !lw.a(i5)) && (obj2 == null || !lw.a(i4))) ? 0 : 3;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            sg[] b = se.b(string);
            sg[] b2 = se.b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    lv lvVar = new lv();
                    if (b2 == null) {
                        propertyValuesHolder = PropertyValuesHolder.ofObject(str, lvVar, new Object[]{b});
                    } else if (se.a(b, b2)) {
                        propertyValuesHolder = PropertyValuesHolder.ofObject(str, lvVar, new Object[]{b, b2});
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(" Can't morph from ");
                        stringBuilder.append(string);
                        stringBuilder.append(" to ");
                        stringBuilder.append(string2);
                        throw new InflateException(stringBuilder.toString());
                    }
                } else if (b2 != null) {
                    return PropertyValuesHolder.ofObject(str, new lv(), new Object[]{b2});
                }
            }
        }
        PropertyValuesHolder ofFloat;
        TypeEvaluator typeEvaluator = i == 3 ? ly.a : null;
        int dimension;
        if (i == 0) {
            float f;
            if (peekValue != null) {
                float dimension2;
                if (i5 == 5) {
                    dimension2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i2, 0.0f);
                }
                if (peekValue2 == null) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2});
                } else {
                    if (i4 != 5) {
                        f = typedArray.getFloat(i3, 0.0f);
                    } else {
                        f = typedArray.getDimension(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2, f});
                }
            } else {
                if (i4 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{f});
            }
        } else if (peekValue != null) {
            if (i5 == 5) {
                i = (int) typedArray.getDimension(i2, 0.0f);
            } else if (lw.a(i5)) {
                i = typedArray.getColor(i2, 0);
            } else {
                i = typedArray.getInt(i2, 0);
            }
            if (peekValue2 == null) {
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{i});
            } else {
                if (i4 == 5) {
                    dimension = (int) typedArray.getDimension(i3, 0.0f);
                } else if (lw.a(i4)) {
                    dimension = typedArray.getColor(i3, 0);
                } else {
                    dimension = typedArray.getInt(i3, 0);
                }
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{i, dimension});
            }
        } else {
            if (peekValue2 != null) {
                if (i4 == 5) {
                    dimension = (int) typedArray.getDimension(i3, 0.0f);
                } else if (lw.a(i4)) {
                    dimension = typedArray.getColor(i3, 0);
                } else {
                    dimension = typedArray.getInt(i3, 0);
                }
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{dimension});
            }
            if (!(propertyValuesHolder == null || typeEvaluator == null)) {
                propertyValuesHolder.setEvaluator(typeEvaluator);
            }
        }
        propertyValuesHolder = ofFloat;
        propertyValuesHolder.setEvaluator(typeEvaluator);
        return propertyValuesHolder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x032a  */
    private static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
        r7 = r28;
        r8 = r29;
        r9 = r30;
        r10 = r32;
        r11 = r30.getDepth();
        r0 = 0;
        r13 = 0;
    L_0x000e:
        r1 = r30.next();
        r2 = 3;
        r14 = 0;
        if (r1 != r2) goto L_0x001c;
    L_0x0016:
        r3 = r30.getDepth();
        if (r3 <= r11) goto L_0x033b;
    L_0x001c:
        r3 = 1;
        if (r1 == r3) goto L_0x033b;
    L_0x001f:
        r4 = 2;
        if (r1 == r4) goto L_0x0023;
    L_0x0022:
        goto L_0x000e;
    L_0x0023:
        r1 = r30.getName();
        r5 = "objectAnimator";
        r5 = r1.equals(r5);
        if (r5 != 0) goto L_0x030c;
    L_0x002f:
        r5 = "animator";
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x004a;
    L_0x0037:
        r4 = 0;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r31;
        r5 = r30;
        r0 = defpackage.lw.a(r0, r1, r2, r3, r4, r5);
        r19 = r11;
        goto L_0x0323;
    L_0x004a:
        r5 = "set";
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x007f;
    L_0x0052:
        r15 = new android.animation.AnimatorSet;
        r15.<init>();
        r0 = defpackage.lm.h;
        r6 = r31;
        r5 = defpackage.sd.a(r7, r8, r6, r0);
        r0 = "ordering";
        r16 = defpackage.sd.a(r5, r9, r0, r14, r14);
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r30;
        r4 = r31;
        r17 = r5;
        r5 = r15;
        r6 = r16;
        defpackage.lw.a(r0, r1, r2, r3, r4, r5, r6);
        r17.recycle();
        r19 = r11;
        r0 = r15;
        goto L_0x0323;
    L_0x007f:
        r5 = "propertyValuesHolder";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x02f1;
    L_0x0087:
        r1 = android.util.Xml.asAttributeSet(r30);
        r6 = 0;
    L_0x008c:
        r15 = r30.getEventType();
        if (r15 == r2) goto L_0x02ca;
    L_0x0092:
        if (r15 == r3) goto L_0x02ca;
    L_0x0094:
        if (r15 == r4) goto L_0x009a;
    L_0x0096:
        r30.next();
        goto L_0x008c;
    L_0x009a:
        r15 = r30.getName();
        r15 = r15.equals(r5);
        if (r15 == 0) goto L_0x02ae;
    L_0x00a4:
        r15 = defpackage.lm.i;
        r15 = defpackage.sd.a(r7, r8, r1, r15);
        r12 = "propertyName";
        r12 = defpackage.sd.b(r15, r9, r12, r2);
        r14 = 4;
        r3 = "valueType";
        r3 = defpackage.sd.a(r15, r9, r3, r4, r14);
        r20 = r1;
        r14 = r3;
        r4 = 0;
    L_0x00bb:
        r1 = r30.next();
        r21 = r5;
        if (r1 == r2) goto L_0x018d;
    L_0x00c3:
        r5 = 1;
        if (r1 == r5) goto L_0x018d;
    L_0x00c6:
        r1 = r30.getName();
        r5 = "keyframe";
        r1 = r1.equals(r5);
        if (r1 != 0) goto L_0x00d9;
    L_0x00d2:
        r7 = r27;
        r19 = r11;
        r11 = 4;
        goto L_0x0182;
    L_0x00d9:
        r1 = "value";
        r5 = 4;
        if (r14 != r5) goto L_0x00fd;
    L_0x00de:
        r5 = android.util.Xml.asAttributeSet(r30);
        r14 = defpackage.lm.j;
        r5 = defpackage.sd.a(r7, r8, r5, r14);
        r14 = defpackage.sd.a(r5, r9, r1);
        if (r14 == 0) goto L_0x00f9;
    L_0x00ee:
        r14 = r14.type;
        r14 = defpackage.lw.a(r14);
        if (r14 != 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00f9;
    L_0x00f7:
        r14 = 3;
        goto L_0x00fa;
    L_0x00f9:
        r14 = 0;
    L_0x00fa:
        r5.recycle();
    L_0x00fd:
        r5 = android.util.Xml.asAttributeSet(r30);
        r2 = defpackage.lm.j;
        r2 = defpackage.sd.a(r7, r8, r5, r2);
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = "fraction";
        r8 = 3;
        r5 = defpackage.sd.a(r2, r9, r7, r8, r5);
        r7 = defpackage.sd.a(r2, r9, r1);
        if (r7 != 0) goto L_0x011a;
    L_0x0116:
        r19 = r11;
        r8 = 0;
        goto L_0x011d;
    L_0x011a:
        r19 = r11;
        r8 = 1;
    L_0x011d:
        r11 = 4;
        if (r14 == r11) goto L_0x0122;
    L_0x0120:
        r7 = r14;
        goto L_0x0130;
    L_0x0122:
        if (r8 == 0) goto L_0x012f;
    L_0x0124:
        r7 = r7.type;
        r7 = defpackage.lw.a(r7);
        if (r7 != 0) goto L_0x012d;
    L_0x012c:
        goto L_0x012f;
    L_0x012d:
        r7 = 3;
        goto L_0x0130;
    L_0x012f:
        r7 = 0;
    L_0x0130:
        if (r8 == 0) goto L_0x0151;
    L_0x0132:
        if (r7 == 0) goto L_0x0146;
    L_0x0134:
        r8 = 1;
        if (r7 == r8) goto L_0x013c;
    L_0x0137:
        r8 = 3;
        if (r7 == r8) goto L_0x013c;
    L_0x013a:
        r1 = 0;
        goto L_0x015c;
    L_0x013c:
        r7 = 0;
        r1 = defpackage.sd.a(r2, r9, r1, r7, r7);
        r1 = android.animation.Keyframe.ofInt(r5, r1);
        goto L_0x015c;
    L_0x0146:
        r7 = 0;
        r8 = 0;
        r1 = defpackage.sd.a(r2, r9, r1, r7, r8);
        r1 = android.animation.Keyframe.ofFloat(r5, r1);
        goto L_0x015c;
    L_0x0151:
        if (r7 != 0) goto L_0x0158;
    L_0x0153:
        r1 = android.animation.Keyframe.ofFloat(r5);
        goto L_0x015c;
    L_0x0158:
        r1 = android.animation.Keyframe.ofInt(r5);
    L_0x015c:
        r5 = "interpolator";
        r7 = 1;
        r5 = defpackage.sd.a(r2, r9, r5, r7);
        r7 = r27;
        if (r5 <= 0) goto L_0x016e;
    L_0x0167:
        r5 = defpackage.lt.a(r7, r5);
        r1.setInterpolator(r5);
    L_0x016e:
        r2.recycle();
        if (r1 != 0) goto L_0x0174;
    L_0x0173:
        goto L_0x017f;
    L_0x0174:
        if (r4 != 0) goto L_0x017c;
    L_0x0176:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r4 = r2;
    L_0x017c:
        r4.add(r1);
    L_0x017f:
        r30.next();
    L_0x0182:
        r7 = r28;
        r8 = r29;
        r11 = r19;
        r5 = r21;
        r2 = 3;
        goto L_0x00bb;
    L_0x018d:
        r7 = r27;
        r19 = r11;
        if (r4 != 0) goto L_0x0199;
    L_0x0193:
        r1 = 0;
        r2 = 3;
        r18 = 2;
        goto L_0x0291;
    L_0x0199:
        r1 = r4.size();
        if (r1 <= 0) goto L_0x028d;
    L_0x019f:
        r2 = 0;
        r5 = r4.get(r2);
        r5 = (android.animation.Keyframe) r5;
        r2 = r1 + -1;
        r2 = r4.get(r2);
        r2 = (android.animation.Keyframe) r2;
        r8 = r2.getFraction();
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r23 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r23 >= 0) goto L_0x01cf;
    L_0x01b8:
        r22 = 0;
        r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1));
        if (r8 >= 0) goto L_0x01c2;
    L_0x01be:
        r2.setFraction(r11);
        goto L_0x01cf;
    L_0x01c2:
        r8 = r4.size();
        r2 = defpackage.lw.a(r2, r11);
        r4.add(r8, r2);
        r1 = r1 + 1;
    L_0x01cf:
        r2 = r5.getFraction();
        r8 = 0;
        r22 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r22 == 0) goto L_0x01ea;
    L_0x01d8:
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x01e0;
    L_0x01dc:
        r5.setFraction(r8);
        goto L_0x01ea;
    L_0x01e0:
        r2 = defpackage.lw.a(r5, r8);
        r5 = 0;
        r4.add(r5, r2);
        r1 = r1 + 1;
    L_0x01ea:
        r2 = new android.animation.Keyframe[r1];
        r4.toArray(r2);
        r4 = 0;
    L_0x01f0:
        if (r4 >= r1) goto L_0x027d;
    L_0x01f2:
        r5 = r2[r4];
        r8 = r5.getFraction();
        r22 = 0;
        r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1));
        if (r8 < 0) goto L_0x0207;
    L_0x01fe:
        r24 = r1;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = 0;
        r18 = 2;
        goto L_0x0273;
    L_0x0207:
        if (r4 == 0) goto L_0x0269;
    L_0x0209:
        r8 = r1 + -1;
        if (r4 == r8) goto L_0x025e;
    L_0x020d:
        r5 = r4 + 1;
        r11 = r4;
    L_0x0210:
        if (r5 < r8) goto L_0x0213;
    L_0x0212:
        goto L_0x0227;
    L_0x0213:
        r24 = r2[r5];
        r24 = r24.getFraction();
        r22 = 0;
        r24 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1));
        if (r24 >= 0) goto L_0x0227;
    L_0x021f:
        r11 = r5 + 1;
        r26 = r11;
        r11 = r5;
        r5 = r26;
        goto L_0x0210;
    L_0x0227:
        r5 = r11 + 1;
        r5 = r2[r5];
        r5 = r5.getFraction();
        r8 = r4 + -1;
        r8 = r2[r8];
        r8 = r8.getFraction();
        r5 = r5 - r8;
        r8 = r11 - r4;
        r18 = 2;
        r8 = r8 + 2;
        r8 = (float) r8;
        r5 = r5 / r8;
        r8 = r4;
    L_0x0241:
        r24 = r1;
        if (r8 > r11) goto L_0x025b;
    L_0x0245:
        r1 = r2[r8];
        r25 = r8 + -1;
        r25 = r2[r25];
        r25 = r25.getFraction();
        r7 = r25 + r5;
        r1.setFraction(r7);
        r8 = r8 + 1;
        r7 = r27;
        r1 = r24;
        goto L_0x0241;
    L_0x025b:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0267;
    L_0x025e:
        r24 = r1;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r18 = 2;
        r5.setFraction(r1);
    L_0x0267:
        r7 = 0;
        goto L_0x0273;
    L_0x0269:
        r24 = r1;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = 0;
        r18 = 2;
        r5.setFraction(r7);
    L_0x0273:
        r4 = r4 + 1;
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = r27;
        r1 = r24;
        goto L_0x01f0;
    L_0x027d:
        r18 = 2;
        r1 = android.animation.PropertyValuesHolder.ofKeyframe(r12, r2);
        r2 = 3;
        if (r14 == r2) goto L_0x0287;
    L_0x0286:
        goto L_0x0291;
    L_0x0287:
        r4 = defpackage.ly.a;
        r1.setEvaluator(r4);
        goto L_0x0291;
    L_0x028d:
        r2 = 3;
        r18 = 2;
        r1 = 0;
    L_0x0291:
        if (r1 != 0) goto L_0x029a;
    L_0x0293:
        r5 = 1;
        r7 = 0;
        r1 = defpackage.lw.a(r15, r3, r7, r5, r12);
        goto L_0x029c;
    L_0x029a:
        r5 = 1;
        r7 = 0;
    L_0x029c:
        if (r1 != 0) goto L_0x029f;
    L_0x029e:
        goto L_0x02aa;
    L_0x029f:
        if (r6 != 0) goto L_0x02a7;
    L_0x02a1:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r6 = r3;
    L_0x02a7:
        r6.add(r1);
    L_0x02aa:
        r15.recycle();
        goto L_0x02b8;
    L_0x02ae:
        r20 = r1;
        r21 = r5;
        r19 = r11;
        r5 = 1;
        r7 = 0;
        r18 = 2;
    L_0x02b8:
        r30.next();
        r7 = r28;
        r8 = r29;
        r11 = r19;
        r1 = r20;
        r5 = r21;
        r3 = 1;
        r4 = 2;
        r14 = 0;
        goto L_0x008c;
    L_0x02ca:
        r19 = r11;
        r5 = 1;
        r7 = 0;
        if (r6 == 0) goto L_0x02e3;
    L_0x02d0:
        r1 = r6.size();
        r12 = new android.animation.PropertyValuesHolder[r1];
    L_0x02d6:
        if (r7 >= r1) goto L_0x02e4;
    L_0x02d8:
        r2 = r6.get(r7);
        r2 = (android.animation.PropertyValuesHolder) r2;
        r12[r7] = r2;
        r7 = r7 + 1;
        goto L_0x02d6;
    L_0x02e3:
        r12 = 0;
    L_0x02e4:
        if (r12 == 0) goto L_0x0324;
    L_0x02e6:
        r1 = r0 instanceof android.animation.ValueAnimator;
        if (r1 == 0) goto L_0x0324;
    L_0x02ea:
        r1 = r0;
        r1 = (android.animation.ValueAnimator) r1;
        r1.setValues(r12);
        goto L_0x0324;
    L_0x02f1:
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unknown animator name: ";
        r1.append(r2);
        r2 = r30.getName();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x030c:
        r19 = r11;
        r7 = 0;
        r6 = new android.animation.ObjectAnimator;
        r6.<init>();
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r31;
        r4 = r6;
        r5 = r30;
        defpackage.lw.a(r0, r1, r2, r3, r4, r5);
        r0 = r6;
    L_0x0323:
        r5 = 0;
    L_0x0324:
        if (r10 == 0) goto L_0x0333;
    L_0x0326:
        if (r5 != 0) goto L_0x0333;
    L_0x0328:
        if (r13 != 0) goto L_0x0330;
    L_0x032a:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r13 = r1;
    L_0x0330:
        r13.add(r0);
    L_0x0333:
        r7 = r28;
        r8 = r29;
        r11 = r19;
        goto L_0x000e;
    L_0x033b:
        r7 = 0;
        if (r10 == 0) goto L_0x0365;
    L_0x033e:
        if (r13 != 0) goto L_0x0341;
    L_0x0340:
        goto L_0x0365;
    L_0x0341:
        r1 = r13.size();
        r1 = new android.animation.Animator[r1];
        r2 = r13.size();
        r3 = 0;
    L_0x034c:
        if (r7 >= r2) goto L_0x035c;
    L_0x034e:
        r4 = r3 + 1;
        r5 = r13.get(r7);
        r5 = (android.animation.Animator) r5;
        r1[r3] = r5;
        r7 = r7 + 1;
        r3 = r4;
        goto L_0x034c;
    L_0x035c:
        if (r33 != 0) goto L_0x0362;
    L_0x035e:
        r10.playTogether(r1);
        goto L_0x0365;
    L_0x0362:
        r10.playSequentially(r1);
    L_0x0365:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ce  */
    private static android.animation.ValueAnimator a(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23, android.animation.ValueAnimator r24, org.xmlpull.v1.XmlPullParser r25) {
        /*
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r3 = r25;
        r4 = defpackage.lm.g;
        r4 = defpackage.sd.a(r0, r1, r2, r4);
        r5 = defpackage.lm.k;
        r0 = defpackage.sd.a(r0, r1, r2, r5);
        if (r24 != 0) goto L_0x001c;
    L_0x0016:
        r1 = new android.animation.ValueAnimator;
        r1.<init>();
        goto L_0x001e;
    L_0x001c:
        r1 = r24;
    L_0x001e:
        r2 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r5 = 1;
        r6 = "duration";
        r2 = defpackage.sd.a(r4, r3, r6, r5, r2);
        r6 = (long) r2;
        r2 = 2;
        r8 = 0;
        r9 = "startOffset";
        r9 = defpackage.sd.a(r4, r3, r9, r2, r8);
        r9 = (long) r9;
        r11 = 7;
        r12 = 4;
        r13 = "valueType";
        r11 = defpackage.sd.a(r4, r3, r13, r11, r12);
        r13 = "valueFrom";
        r13 = defpackage.sd.a(r3, r13);
        r14 = 3;
        if (r13 == 0) goto L_0x0094;
    L_0x0042:
        r13 = "valueTo";
        r13 = defpackage.sd.a(r3, r13);
        if (r13 != 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0094;
    L_0x004b:
        r13 = 6;
        r15 = 5;
        if (r11 != r12) goto L_0x0085;
    L_0x004f:
        r11 = r4.peekValue(r15);
        if (r11 != 0) goto L_0x0058;
    L_0x0055:
        r16 = 0;
        goto L_0x005a;
    L_0x0058:
        r16 = 1;
    L_0x005a:
        if (r16 == 0) goto L_0x005f;
    L_0x005c:
        r11 = r11.type;
        goto L_0x0060;
    L_0x005f:
        r11 = 0;
    L_0x0060:
        r2 = r4.peekValue(r13);
        if (r2 != 0) goto L_0x0069;
    L_0x0066:
        r17 = 0;
        goto L_0x006b;
    L_0x0069:
        r17 = 1;
    L_0x006b:
        if (r17 == 0) goto L_0x0070;
    L_0x006d:
        r2 = r2.type;
        goto L_0x0071;
    L_0x0070:
        r2 = 0;
    L_0x0071:
        if (r16 == 0) goto L_0x007b;
    L_0x0073:
        r11 = defpackage.lw.a(r11);
        if (r11 == 0) goto L_0x007b;
    L_0x0079:
        r11 = 3;
        goto L_0x0085;
    L_0x007b:
        if (r17 == 0) goto L_0x0084;
    L_0x007d:
        r2 = defpackage.lw.a(r2);
        if (r2 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x0079;
    L_0x0084:
        r11 = 0;
    L_0x0085:
        r2 = "";
        r2 = defpackage.lw.a(r4, r11, r15, r13, r2);
        if (r2 == 0) goto L_0x0094;
    L_0x008d:
        r11 = new android.animation.PropertyValuesHolder[r5];
        r11[r8] = r2;
        r1.setValues(r11);
    L_0x0094:
        r1.setDuration(r6);
        r1.setStartDelay(r9);
        r2 = "repeatCount";
        r2 = defpackage.sd.a(r4, r3, r2, r14, r8);
        r1.setRepeatCount(r2);
        r2 = "repeatMode";
        r2 = defpackage.sd.a(r4, r3, r2, r12, r5);
        r1.setRepeatMode(r2);
        if (r0 == 0) goto L_0x01b0;
    L_0x00ae:
        r2 = r1;
        r2 = (android.animation.ObjectAnimator) r2;
        r6 = "pathData";
        r6 = defpackage.sd.b(r0, r3, r6, r5);
        if (r6 == 0) goto L_0x01a3;
    L_0x00b9:
        r7 = "propertyXName";
        r9 = 2;
        r7 = defpackage.sd.b(r0, r3, r7, r9);
        r9 = "propertyYName";
        r9 = defpackage.sd.b(r0, r3, r9, r14);
        if (r7 == 0) goto L_0x00c9;
    L_0x00c8:
        goto L_0x00cb;
    L_0x00c9:
        if (r9 == 0) goto L_0x0188;
    L_0x00cb:
        r6 = defpackage.se.a(r6);
        r10 = new android.graphics.PathMeasure;
        r10.<init>(r6, r8);
        r11 = new java.util.ArrayList;
        r11.<init>();
        r12 = 0;
        r13 = java.lang.Float.valueOf(r12);
        r11.add(r13);
        r13 = 0;
    L_0x00e2:
        r14 = r10.getLength();
        r13 = r13 + r14;
        r14 = java.lang.Float.valueOf(r13);
        r11.add(r14);
        r14 = r10.nextContour();
        if (r14 != 0) goto L_0x0185;
    L_0x00f4:
        r10 = new android.graphics.PathMeasure;
        r10.<init>(r6, r8);
        r6 = 100;
        r14 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r14 = r13 / r14;
        r14 = (int) r14;
        r14 = r14 + r5;
        r6 = java.lang.Math.min(r6, r14);
        r14 = new float[r6];
        r15 = new float[r6];
        r12 = 2;
        r5 = new float[r12];
        r12 = r6 + -1;
        r12 = (float) r12;
        r13 = r13 / r12;
        r17 = r1;
        r12 = 0;
        r16 = 0;
    L_0x0115:
        r1 = 0;
        if (r12 >= r6) goto L_0x0154;
    L_0x0118:
        r18 = r11.get(r8);
        r18 = (java.lang.Float) r18;
        r18 = r18.floatValue();
        r19 = r6;
        r6 = r16 - r18;
        r10.getPosTan(r6, r5, r1);
        r1 = 0;
        r6 = r5[r1];
        r14[r12] = r6;
        r1 = 1;
        r6 = r5[r1];
        r15[r12] = r6;
        r16 = r16 + r13;
        r1 = r8 + 1;
        r6 = r11.size();
        if (r1 >= r6) goto L_0x014f;
    L_0x013d:
        r6 = r11.get(r1);
        r6 = (java.lang.Float) r6;
        r6 = r6.floatValue();
        r6 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x014f;
    L_0x014b:
        r10.nextContour();
        r8 = r1;
    L_0x014f:
        r12 = r12 + 1;
        r6 = r19;
        goto L_0x0115;
    L_0x0154:
        if (r7 == 0) goto L_0x015b;
    L_0x0156:
        r5 = android.animation.PropertyValuesHolder.ofFloat(r7, r14);
        goto L_0x015c;
    L_0x015b:
        r5 = r1;
    L_0x015c:
        if (r9 == 0) goto L_0x0162;
    L_0x015e:
        r1 = android.animation.PropertyValuesHolder.ofFloat(r9, r15);
    L_0x0162:
        if (r5 != 0) goto L_0x016e;
    L_0x0164:
        r8 = 1;
        r5 = new android.animation.PropertyValuesHolder[r8];
        r6 = 0;
        r5[r6] = r1;
        r2.setValues(r5);
        goto L_0x01b2;
    L_0x016e:
        r6 = 0;
        r8 = 1;
        if (r1 == 0) goto L_0x017d;
    L_0x0172:
        r12 = 2;
        r7 = new android.animation.PropertyValuesHolder[r12];
        r7[r6] = r5;
        r7[r8] = r1;
        r2.setValues(r7);
        goto L_0x01b2;
    L_0x017d:
        r1 = new android.animation.PropertyValuesHolder[r8];
        r1[r6] = r5;
        r2.setValues(r1);
        goto L_0x01b2;
    L_0x0185:
        r12 = 0;
        goto L_0x00e2;
    L_0x0188:
        r1 = new android.view.InflateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r0.getPositionDescription();
        r2.append(r0);
        r0 = " propertyXName or propertyYName is needed for PathData";
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x01a3:
        r17 = r1;
        r1 = "propertyName";
        r5 = 0;
        r1 = defpackage.sd.b(r0, r3, r1, r5);
        r2.setPropertyName(r1);
        goto L_0x01b3;
    L_0x01b0:
        r17 = r1;
    L_0x01b2:
        r5 = 0;
    L_0x01b3:
        r1 = "interpolator";
        r1 = defpackage.sd.a(r4, r3, r1, r5);
        if (r1 <= 0) goto L_0x01c7;
    L_0x01bb:
        r2 = r20;
        r1 = defpackage.lt.a(r2, r1);
        r2 = r17;
        r2.setInterpolator(r1);
        goto L_0x01c9;
    L_0x01c7:
        r2 = r17;
    L_0x01c9:
        r4.recycle();
        if (r0 == 0) goto L_0x01d1;
    L_0x01ce:
        r0.recycle();
    L_0x01d1:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ValueAnimator, org.xmlpull.v1.XmlPullParser):android.animation.ValueAnimator");
    }
}
