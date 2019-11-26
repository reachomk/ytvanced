package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: cu */
public final class cu {
    private static final int[] b = new int[]{0, 4, 8};
    private static SparseIntArray c;
    public final HashMap a = new HashMap();

    public final void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    int i2 = 0;
                    ct ctVar = new ct();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, cv.W);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    while (i2 < indexCount) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        int i3 = c.get(index);
                        String str = "   ";
                        String str2 = "ConstraintSet";
                        StringBuilder stringBuilder;
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    ctVar.p = cu.a(obtainStyledAttributes, index, ctVar.p);
                                    break;
                                case 2:
                                    ctVar.D = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.D);
                                    break;
                                case 3:
                                    ctVar.o = cu.a(obtainStyledAttributes, index, ctVar.o);
                                    break;
                                case 4:
                                    ctVar.n = cu.a(obtainStyledAttributes, index, ctVar.n);
                                    break;
                                case 5:
                                    ctVar.w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    ctVar.x = obtainStyledAttributes.getDimensionPixelOffset(index, ctVar.x);
                                    break;
                                case 7:
                                    ctVar.y = obtainStyledAttributes.getDimensionPixelOffset(index, ctVar.y);
                                    break;
                                case 8:
                                    ctVar.E = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.E);
                                    break;
                                case 9:
                                    ctVar.n = cu.a(obtainStyledAttributes, index, ctVar.t);
                                    break;
                                case 10:
                                    ctVar.s = cu.a(obtainStyledAttributes, index, ctVar.s);
                                    break;
                                case 11:
                                    ctVar.K = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.K);
                                    break;
                                case 12:
                                    ctVar.L = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.L);
                                    break;
                                case 13:
                                    ctVar.H = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.H);
                                    break;
                                case 14:
                                    ctVar.J = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.J);
                                    break;
                                case 15:
                                    ctVar.M = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.M);
                                    break;
                                case 16:
                                    ctVar.I = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.I);
                                    break;
                                case 17:
                                    ctVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, ctVar.e);
                                    break;
                                case 18:
                                    ctVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, ctVar.f);
                                    break;
                                case 19:
                                    ctVar.g = obtainStyledAttributes.getFloat(index, ctVar.g);
                                    break;
                                case 20:
                                    ctVar.u = obtainStyledAttributes.getFloat(index, ctVar.u);
                                    break;
                                case 21:
                                    ctVar.c = obtainStyledAttributes.getLayoutDimension(index, ctVar.c);
                                    break;
                                case 22:
                                    ctVar.G = obtainStyledAttributes.getInt(index, ctVar.G);
                                    ctVar.G = b[ctVar.G];
                                    break;
                                case 23:
                                    ctVar.b = obtainStyledAttributes.getLayoutDimension(index, ctVar.b);
                                    break;
                                case 24:
                                    ctVar.A = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.A);
                                    break;
                                case 25:
                                    ctVar.h = cu.a(obtainStyledAttributes, index, ctVar.h);
                                    break;
                                case 26:
                                    ctVar.i = cu.a(obtainStyledAttributes, index, ctVar.i);
                                    break;
                                case 27:
                                    ctVar.z = obtainStyledAttributes.getInt(index, ctVar.z);
                                    break;
                                case 28:
                                    ctVar.B = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.B);
                                    break;
                                case 29:
                                    ctVar.j = cu.a(obtainStyledAttributes, index, ctVar.j);
                                    break;
                                case 30:
                                    ctVar.k = cu.a(obtainStyledAttributes, index, ctVar.k);
                                    break;
                                case 31:
                                    ctVar.F = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.F);
                                    break;
                                case 32:
                                    ctVar.q = cu.a(obtainStyledAttributes, index, ctVar.q);
                                    break;
                                case 33:
                                    ctVar.r = cu.a(obtainStyledAttributes, index, ctVar.r);
                                    break;
                                case 34:
                                    ctVar.C = obtainStyledAttributes.getDimensionPixelSize(index, ctVar.C);
                                    break;
                                case 35:
                                    ctVar.m = cu.a(obtainStyledAttributes, index, ctVar.m);
                                    break;
                                case 36:
                                    ctVar.l = cu.a(obtainStyledAttributes, index, ctVar.l);
                                    break;
                                case 37:
                                    ctVar.v = obtainStyledAttributes.getFloat(index, ctVar.v);
                                    break;
                                case 38:
                                    ctVar.d = obtainStyledAttributes.getResourceId(index, ctVar.d);
                                    break;
                                case 39:
                                    ctVar.O = obtainStyledAttributes.getFloat(index, ctVar.O);
                                    break;
                                case 40:
                                    ctVar.N = obtainStyledAttributes.getFloat(index, ctVar.N);
                                    break;
                                case 41:
                                    ctVar.P = obtainStyledAttributes.getInt(index, ctVar.P);
                                    break;
                                case 42:
                                    ctVar.Q = obtainStyledAttributes.getInt(index, ctVar.Q);
                                    break;
                                case 43:
                                    ctVar.R = obtainStyledAttributes.getFloat(index, ctVar.R);
                                    break;
                                case 44:
                                    ctVar.S = true;
                                    ctVar.T = obtainStyledAttributes.getFloat(index, ctVar.T);
                                    break;
                                case 45:
                                    ctVar.U = obtainStyledAttributes.getFloat(index, ctVar.U);
                                    break;
                                case 46:
                                    ctVar.V = obtainStyledAttributes.getFloat(index, ctVar.V);
                                    break;
                                case 47:
                                    ctVar.W = obtainStyledAttributes.getFloat(index, ctVar.W);
                                    break;
                                case 48:
                                    ctVar.X = obtainStyledAttributes.getFloat(index, ctVar.X);
                                    break;
                                case cv.aT /*49*/:
                                    ctVar.Y = obtainStyledAttributes.getFloat(index, ctVar.Y);
                                    break;
                                case cv.aU /*50*/:
                                    ctVar.Z = obtainStyledAttributes.getFloat(index, ctVar.Z);
                                    break;
                                case cv.aV /*51*/:
                                    ctVar.aa = obtainStyledAttributes.getFloat(index, ctVar.aa);
                                    break;
                                case cv.aW /*52*/:
                                    ctVar.ab = obtainStyledAttributes.getFloat(index, ctVar.ab);
                                    break;
                                case cv.aX /*53*/:
                                    ctVar.ac = obtainStyledAttributes.getFloat(index, ctVar.ac);
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown attribute 0x");
                                    stringBuilder.append(Integer.toHexString(index));
                                    stringBuilder.append(str);
                                    stringBuilder.append(c.get(index));
                                    Log.w(str2, stringBuilder.toString());
                                    break;
                            }
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("unused attribute 0x");
                        stringBuilder.append(Integer.toHexString(index));
                        stringBuilder.append(str);
                        stringBuilder.append(c.get(index));
                        Log.w(str2, stringBuilder.toString());
                        i2++;
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        ctVar.a = true;
                    }
                    this.a.put(Integer.valueOf(ctVar.d), ctVar);
                }
            }
        } catch (XmlPullParserException e) {
            ankx.a(e);
        } catch (IOException e2) {
            ankx.a(e2);
        }
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        i2 = typedArray.getResourceId(i, i2);
        return i2 == -1 ? typedArray.getInt(i, -1) : i2;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(cv.aK, 25);
        c.append(cv.aL, 26);
        c.append(cv.aN, 29);
        c.append(cv.aO, 30);
        c.append(cv.aT, 36);
        c.append(cv.aS, 35);
        c.append(cv.aw, 4);
        c.append(cv.av, 3);
        c.append(cv.at, 1);
        c.append(cv.ba, 6);
        c.append(cv.bb, 7);
        c.append(cv.aA, 17);
        c.append(cv.aB, 18);
        c.append(cv.aC, 19);
        c.append(cv.ai, 27);
        c.append(cv.aP, 32);
        c.append(cv.aQ, 33);
        c.append(cv.az, 10);
        c.append(cv.ay, 9);
        c.append(cv.bd, 13);
        c.append(cv.bg, 16);
        c.append(cv.be, 14);
        c.append(58, 11);
        c.append(cv.bf, 15);
        c.append(cv.bc, 12);
        c.append(cv.aW, 40);
        c.append(cv.aI, 39);
        c.append(cv.aH, 41);
        c.append(cv.aV, 42);
        c.append(cv.aG, 20);
        c.append(cv.aU, 37);
        c.append(cv.ax, 5);
        c.append(cv.aJ, 60);
        c.append(cv.aR, 60);
        c.append(cv.aM, 60);
        c.append(cv.au, 60);
        c.append(cv.as, 60);
        c.append(cv.ad, 24);
        c.append(cv.ae, 28);
        c.append(cv.af, 31);
        c.append(cv.ac, 8);
        c.append(cv.ag, 34);
        c.append(cv.ab, 2);
        c.append(cv.ah, 23);
        c.append(cv.aa, 21);
        c.append(cv.ar, 22);
        c.append(cv.X, 43);
        c.append(cv.Y, 44);
        c.append(cv.aj, 45);
        c.append(17, 46);
        c.append(cv.ak, 47);
        c.append(cv.al, 48);
        c.append(cv.am, 49);
        c.append(cv.an, 50);
        c.append(cv.ao, 51);
        c.append(cv.ap, 52);
        c.append(cv.aq, 53);
        c.append(cv.aX, 54);
        c.append(cv.aD, 55);
        c.append(cv.aY, 56);
        c.append(cv.aE, 57);
        c.append(cv.aZ, 58);
        c.append(cv.aF, 59);
        c.append(cv.Z, 38);
    }
}
