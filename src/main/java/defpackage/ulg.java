package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ulg */
public final class ulg extends bakp {
    private static final Pattern c = Pattern.compile("([+-])([0-9]{2})([0-9]{2})?([0-9]{2})?(\\.[0-9]+)?([+-])([0-9]{3})([0-9]{2})?([0-9]{2})?(\\.[0-9]+)?(?:[+-][0-9]+(?:\\.[0-9]+)?)?(?:CRS.*)?/");
    public double a;
    public double b;

    public ulg() {
        super("©xyz");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return 22;
    }

    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int c = cio.c(byteBuffer);
        cio.a(byteBuffer2, 2);
        Matcher matcher = c.matcher(cio.a(byteBuffer2, c));
        if (matcher.matches()) {
            c = 1;
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            String group4 = matcher.group(4);
            String group5 = matcher.group(5);
            if (group5 != null) {
                if (group4 != null) {
                    group4 = group5.length() == 0 ? new String(group4) : group4.concat(group5);
                } else if (group3 != null) {
                    group3 = group5.length() == 0 ? new String(group3) : group3.concat(group5);
                } else {
                    group2 = String.valueOf(group2);
                    group2 = group5.length() == 0 ? new String(group2) : group2.concat(group5);
                }
            }
            double d = 0.0d;
            double parseDouble = (Double.parseDouble(group2) + (group3 != null ? Double.parseDouble(group3) / 60.0d : 0.0d)) + (group4 != null ? Double.parseDouble(group4) / 3600.0d : 0.0d);
            group2 = "-";
            double d2 = (double) (!group2.equals(group) ? 1 : -1);
            Double.isNaN(d2);
            parseDouble *= d2;
            this.b = parseDouble;
            if (parseDouble < -90.0d || parseDouble > 90.0d) {
                this.b = Double.NaN;
            }
            group = matcher.group(6);
            group3 = matcher.group(7);
            group4 = matcher.group(8);
            group5 = matcher.group(9);
            String group6 = matcher.group(10);
            if (group6 != null) {
                if (group5 != null) {
                    group5 = group6.length() == 0 ? new String(group5) : group5.concat(group6);
                } else if (group4 != null) {
                    group4 = group6.length() == 0 ? new String(group4) : group4.concat(group6);
                } else {
                    group3 = String.valueOf(group3);
                    group3 = group6.length() == 0 ? new String(group3) : group3.concat(group6);
                }
            }
            double parseDouble2 = Double.parseDouble(group3) + (group4 != null ? Double.parseDouble(group4) / 60.0d : 0.0d);
            if (group5 != null) {
                d = Double.parseDouble(group5) / 3600.0d;
            }
            parseDouble2 += d;
            if (group2.equals(group)) {
                c = -1;
            }
            double d3 = (double) c;
            Double.isNaN(d3);
            d3 *= parseDouble2;
            this.a = d3;
            if (d3 < -180.0d || d3 > 180.0d) {
                this.a = Double.NaN;
            }
            return;
        }
        this.b = Double.NaN;
        this.a = Double.NaN;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        cin.b(byteBuffer2, 18);
        byteBuffer2.put(new byte[]{(byte) 21, (byte) -57});
        long round = Math.round(this.b * 10000.0d);
        long j = round < 0 ? -round : round;
        long j2 = j / 10000;
        j %= 10000;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        char c = '+';
        objArr[0] = Character.valueOf(round >= 0 ? '+' : '-');
        objArr[1] = Long.valueOf(j2);
        objArr[2] = Long.valueOf(j);
        byteBuffer2.put(ciq.a(String.format(locale, "%c%02d.%04d", objArr)));
        long round2 = Math.round(this.a * 10000.0d);
        j = round2 < 0 ? -round2 : round2;
        long j3 = j / 10000;
        j %= 10000;
        Locale locale2 = Locale.ENGLISH;
        Object[] objArr2 = new Object[3];
        if (round2 < 0) {
            c = '-';
        }
        objArr2[0] = Character.valueOf(c);
        objArr2[1] = Long.valueOf(j3);
        objArr2[2] = Long.valueOf(j);
        byteBuffer2.put(ciq.a(String.format(locale2, "%c%03d.%04d", objArr2)));
        byteBuffer2.put(ciq.a("/"));
    }
}
