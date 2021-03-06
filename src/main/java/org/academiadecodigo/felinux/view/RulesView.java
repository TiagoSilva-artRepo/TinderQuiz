package org.academiadecodigo.felinux.view;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.felinux.controller.RulesController;

public class RulesView extends AbstractView{

    RulesController rulesController;

    public void setRulesController(RulesController rulesController) {
        this.rulesController = rulesController;
    }

    @Override
    public void show() {

        printStream.println(Messages.GAMERULES);
        backToMenu();

    }


    public void backToMenu() {

        MenuInputScanner menu = new MenuInputScanner(Messages.OPTIONS);
        menu.setMessage(Colors.BLUE + Messages.MENU_VIEW + Colors.NOCOLOR);
        menu.setError(Messages.MENU_VIEW_ERROR);

        prompt.getUserInput(menu);
    }
}
