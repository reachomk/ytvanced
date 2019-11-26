package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: rz */
public final class rz {
    public static Drawable a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static int b(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, ry ryVar, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        return rz.a(context, resources, typedValue, i, i2, ryVar, z);
    }

    private static Typeface a(Context context, Resources resources, TypedValue typedValue, int i, int i2, ry ryVar, boolean z) {
        StringBuilder stringBuilder;
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        ry ryVar2 = ryVar;
        String str = "font-family";
        String str2 = "ResourcesCompat";
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            String str3 = null;
            if (charSequence.startsWith("res/")) {
                Typeface typeface = (Typeface) sj.a.a(sj.a(resources2, i3, i4));
                if (typeface == null) {
                    try {
                        if (charSequence.toLowerCase().endsWith(".xml")) {
                            XmlPullParser xml = resources2.getXml(i3);
                            while (true) {
                                int next = xml.next();
                                if (next == 2) {
                                    rq rvVar;
                                    xml.require(2, str3, str);
                                    if (xml.getName().equals(str)) {
                                        TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xml), cr.e);
                                        String string = obtainAttributes.getString(0);
                                        String string2 = obtainAttributes.getString(1);
                                        String string3 = obtainAttributes.getString(2);
                                        int resourceId = obtainAttributes.getResourceId(3, 0);
                                        next = obtainAttributes.getInteger(4, 1);
                                        int integer = obtainAttributes.getInteger(5, 500);
                                        obtainAttributes.recycle();
                                        if (string != null) {
                                            if (!(string2 == null || string3 == null)) {
                                                while (xml.next() != 3) {
                                                    rr.a(xml);
                                                }
                                                rvVar = new rv(new yg(string, string2, string3, rr.a(resources2, resourceId)), next, integer);
                                            }
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        while (xml.next() != 3) {
                                            if (xml.getEventType() == 2) {
                                                if (xml.getName().equals("font")) {
                                                    TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xml), cr.f);
                                                    int i5 = obtainAttributes2.getInt(!obtainAttributes2.hasValue(8) ? cr.j : cr.o, 400);
                                                    boolean z2 = obtainAttributes2.getInt(!obtainAttributes2.hasValue(6) ? cr.h : cr.m, 0) == 1;
                                                    resourceId = !obtainAttributes2.hasValue(9) ? cr.k : cr.p;
                                                    String string4 = obtainAttributes2.getString(!obtainAttributes2.hasValue(5) ? cr.i : cr.n);
                                                    int i6 = obtainAttributes2.getInt(resourceId, 0);
                                                    if (obtainAttributes2.hasValue(7)) {
                                                        resourceId = cr.l;
                                                    } else {
                                                        resourceId = cr.g;
                                                    }
                                                    int resourceId2 = obtainAttributes2.getResourceId(resourceId, 0);
                                                    String string5 = obtainAttributes2.getString(resourceId);
                                                    obtainAttributes2.recycle();
                                                    while (xml.next() != 3) {
                                                        rr.a(xml);
                                                    }
                                                    arrayList.add(new rs(string5, i5, z2, string4, i6, resourceId2));
                                                } else {
                                                    rr.a(xml);
                                                }
                                            }
                                        }
                                        rvVar = !arrayList.isEmpty() ? new rt((rs[]) arrayList.toArray(new rs[arrayList.size()])) : null;
                                    } else {
                                        rr.a(xml);
                                        rvVar = str3;
                                    }
                                    if (rvVar != null) {
                                        return sj.a(context, rvVar, resources, i, i2, ryVar, z);
                                    }
                                    Log.e(str2, "Failed to find font-family tag");
                                    ryVar2.a(-3);
                                    return null;
                                } else if (next != 1) {
                                    str3 = null;
                                } else {
                                    throw new XmlPullParserException("No start tag found");
                                }
                            }
                        }
                        Typeface a = sj.a(context, resources2, i3, charSequence, i4);
                        if (a != null) {
                            ryVar2.b(a);
                        } else {
                            ryVar2.a(-3);
                        }
                        return a;
                    } catch (XmlPullParserException e) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to parse xml resource ");
                        stringBuilder.append(charSequence);
                        Log.e(str2, stringBuilder.toString(), e);
                        ryVar2.a(-3);
                        return null;
                    } catch (IOException e2) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to read xml resource ");
                        stringBuilder.append(charSequence);
                        Log.e(str2, stringBuilder.toString(), e2);
                        ryVar2.a(-3);
                        return null;
                    }
                }
                ryVar2.b(typeface);
                return typeface;
            }
            Typeface typeface2 = null;
            ryVar2.a(-3);
            return typeface2;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Resource \"");
        stringBuilder2.append(resources2.getResourceName(i3));
        stringBuilder2.append("\" (");
        stringBuilder2.append(Integer.toHexString(i));
        stringBuilder2.append(") is not a Font: ");
        stringBuilder2.append(typedValue2);
        throw new NotFoundException(stringBuilder2.toString());
    }
}
