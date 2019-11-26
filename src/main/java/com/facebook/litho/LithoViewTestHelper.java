package com.facebook.litho;

import android.text.TextUtils;
import android.view.ViewParent;
import defpackage.cnr;
import defpackage.cnu;
import defpackage.coz;
import defpackage.cpq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class LithoViewTestHelper {
    public static TestItem findTestItem(cpq cpq, String str) {
        Deque findTestItems = cpq.findTestItems(str);
        return !findTestItems.isEmpty() ? (TestItem) findTestItems.getLast() : null;
    }

    public static Deque findTestItems(cpq cpq, String str) {
        return cpq.findTestItems(str);
    }

    public static String viewToString(cpq cpq) {
        return viewToString(cpq, false);
    }

    public static String viewToString(cpq cpq, boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            int left = cpq.getLeft();
            int top = cpq.getTop();
            int i4 = 2;
            for (ViewParent parent = cpq.getParent(); parent != null; parent = parent.getParent()) {
                i4++;
            }
            i = left;
            i2 = top;
            i3 = i4;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        a(i, i2, cnr.a(cpq), stringBuilder, z, i3);
        return stringBuilder.toString();
    }

    private static void a(int i, int i2, cnr cnr, StringBuilder stringBuilder, boolean z, int i3) {
        if (cnr != null) {
            cnu.addViewDescription(i, i2, cnr, stringBuilder, z);
            List arrayList;
            if (cnr.b()) {
                int i4;
                coz k;
                arrayList = new ArrayList();
                int y = cnr.a.y();
                for (i4 = 0; i4 < y; i4++) {
                    k = cnr.a.k(i4);
                    arrayList.add(cnr.a(k, Math.max(0, k.c.size() - 1)));
                }
                coz coz = cnr.a.g;
                if (!(coz == null || coz.a == null || coz.b == null)) {
                    y = coz.y();
                    for (i4 = 0; i4 < y; i4++) {
                        k = coz.k(i4);
                        arrayList.add(cnr.a(k, Math.max(0, k.c.size() - 1)));
                    }
                }
            } else {
                i = cnr.b;
                arrayList = Arrays.asList(new cnr[]{cnr.a(cnr.a, i - 1)});
            }
            for (cnr cnr2 : arrayList) {
                stringBuilder.append("\n");
                for (int i5 = 0; i5 <= i3; i5++) {
                    stringBuilder.append("  ");
                }
                a(0, 0, cnr2, stringBuilder, z, i3 + 1);
            }
        }
    }

    public static String a(cpq cpq) {
        if (cpq == null) {
            return "";
        }
        String viewToString = viewToString(cpq, true);
        if (!TextUtils.isEmpty(viewToString)) {
            return viewToString;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(cpq.getLeft());
        String str = ",";
        stringBuilder.append(str);
        stringBuilder.append(cpq.getTop());
        stringBuilder.append("-");
        stringBuilder.append(cpq.getRight());
        stringBuilder.append(str);
        stringBuilder.append(cpq.getBottom());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
