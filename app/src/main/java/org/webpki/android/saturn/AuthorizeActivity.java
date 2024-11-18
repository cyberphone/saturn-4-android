package org.webpki.android.saturn;

import org.webpki.android.support.WebViewActivity;

public class AuthorizeActivity extends WebViewActivity {
    final static String MAIN_HTML ="<html><body style='background:blue'>'%28' is the code for '('</body></html>";

    final static String TOOLBAR_HTML = """
<html><body style='background:black;margin:0'>
<div style='border-width:0 0 0.15em 0;border-color:grey;border-style:solid'>
<svg style='max-height:2em;padding:3px 0.5em' viewBox='0 0 170 170' \
xmlns='http://www.w3.org/2000/svg'>
<circle cx='85' cy='85' r='60' fill='#6e9e3f'/>
<path fill='#f9f9f9' d='m 64.81712,101.23602 q 0.625,7.03125 3.515625,\
10.78125 5.3125,6.79688 18.4375,6.79688 7.8125,0 13.749995,-3.35938 \
5.9375,-3.4375 5.9375,-10.54687 0,-5.390627 -4.76562,-8.203127 \
-3.046875,-1.71875 -12.03125,-3.984375 l -11.171875,-2.8125 q -10.703125,\
-2.65625 -15.78125,-5.9375 -9.0625,-5.703125 -9.0625,-15.78125 0,-11.875 \
8.515625,-19.21875 8.59375,-7.34375 23.046875,-7.34375 18.906245,0 \
27.265625,11.09375 5.23437,7.03125 5.07812,15.15625 h -13.28125 q \
-0.39062,-4.765625 -3.35937,-8.671875 -4.84375,-5.546875 -16.796875,\
-5.546875 -7.96875,0 -12.109375,3.046875 -4.0625,3.046875 -4.0625,\
8.046875 0,5.46875 5.390625,8.75 3.125,1.953125 9.21875,3.4375 l \
9.296875,2.265625 q 15.15625,3.671875 20.3125,7.109375 8.20312,5.390625 \
8.20312,16.953122 0,11.17188 -8.51562,19.29688 -8.4375,8.125 -25.78125,\
8.125 -18.671875,0 -26.484375,-8.4375 -7.734375,-8.51563 -8.28125,\
-21.01563 z M 85.59837,41.782898 Z'/>
 <path fill='#ff6a6a' d='M 144.77344,5.2910156 C 131.39763,4.860955 \
 112.70874,12.247111 92.792969,25.554688 c 6.625244,0.857494 13.060771,\
 2.815414 19.041011,5.792968 13.53477,-6.638992 24.50624,-8.144158 \
 29.73438,-2.916015 10.54415,10.544144 -6.23464,44.418247 -37.47656,\
 75.660159 -31.241912,31.24192 -65.116015,48.02071 -75.660159,37.47656 \
 -5.25565,-5.25565 -3.716635,-16.31028 3.011718,-29.94336 C 28.455893,\
 105.71284 26.468067,99.346784 25.560547,92.785156 6.2567361,121.67173 \
 -0.52819607,147.964 10.753906,159.24609 26.765383,175.25757 72.987176,\
 154.9972 113.99219,113.99219 154.9972,72.987175 175.25757,26.765383 \
 159.24609,10.753906 155.74358,7.251395 150.79628,5.4846626 144.77344,5.2910156 Z'/>
</svg>
<div style='font-family:monospace;font-weight:bold;font-size:1.4em;\
color:white;display:inline-block;position:absolute;top:0.5em'>spaceshop.com</div>
</div></body></html>""";

    @Override
    protected String getMainHtml() {
        return MAIN_HTML;
    }

    @Override
    protected String getToolBarHtml() {
        return TOOLBAR_HTML;
    }
}