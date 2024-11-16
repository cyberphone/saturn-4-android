package org.webpki.android.saturn;

import org.webpki.android.support.WebViewActivity;

public class AuthorizeActivity extends WebViewActivity {
    final static String MAIN_HTML ="<html><body>'%28' is the code for '('</body></html>";

    final static String TOOLBAR_HTML = """
        <html style='height:5em'><body style='background:yellow;\
        font-size:1.5em'>'%28' is <br>the code for '('</body></html>""";


    @Override
    protected String getMainHtml() {
        return MAIN_HTML;
    }

    @Override
    protected String getToolBarHtml() {
        return TOOLBAR_HTML;
    }

}