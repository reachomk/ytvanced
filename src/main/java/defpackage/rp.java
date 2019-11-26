package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.youtube.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: rp */
public final class rp {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                return rp.a(resources, xmlPullParser, asAttributeSet, theme);
            }
            if (next == 1) {
                throw new XmlPullParserException("No start tag found");
            }
        }
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            int i = 1;
            int depth = xmlPullParser.getDepth() + 1;
            Object obj = new int[20][];
            Object obj2 = new int[20];
            int i2 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i) {
                    break;
                }
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    break;
                }
                Resources resources2;
                if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray obtainAttributes;
                    int[] iArr = cr.a;
                    if (theme2 == null) {
                        obtainAttributes = resources.obtainAttributes(attributeSet2, iArr);
                    } else {
                        resources2 = resources;
                        obtainAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0);
                    }
                    int color = obtainAttributes.getColor(cr.d, -65281);
                    float f = 1.0f;
                    if (obtainAttributes.hasValue(cr.c)) {
                        f = obtainAttributes.getFloat(cr.c, 1.0f);
                    } else if (obtainAttributes.hasValue(cr.b)) {
                        f = obtainAttributes.getFloat(cr.b, 1.0f);
                    }
                    obtainAttributes.recycle();
                    next = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[next];
                    int i3 = 0;
                    for (int i4 = 0; i4 < next; i4++) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                        if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha)) {
                            i = i3 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i3] = attributeNameResource;
                            i3 = i;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr2, i3);
                    next = (16777215 & color) | (Math.round(((float) Color.alpha(color)) * f) << 24);
                    color = i2 + 1;
                    if (color > obj2.length) {
                        Object obj3 = new int[rw.a(i2)];
                        System.arraycopy(obj2, 0, obj3, 0, i2);
                        obj2 = obj3;
                    }
                    obj2[i2] = next;
                    if (color > obj.length) {
                        Object obj4 = (Object[]) Array.newInstance(obj.getClass().getComponentType(), rw.a(i2));
                        System.arraycopy(obj, 0, obj4, 0, i2);
                        obj = obj4;
                    }
                    obj[i2] = trimStateSet;
                    obj = (int[][]) obj;
                    i2 = color;
                } else {
                    resources2 = resources;
                }
                i = 1;
            }
            int[] iArr3 = new int[i2];
            int[][] iArr4 = new int[i2][];
            System.arraycopy(obj2, 0, iArr3, 0, i2);
            System.arraycopy(obj, 0, iArr4, 0, i2);
            return new ColorStateList(iArr4, iArr3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid color state list tag ");
        stringBuilder.append(name);
        throw new XmlPullParserException(stringBuilder.toString());
    }
}
