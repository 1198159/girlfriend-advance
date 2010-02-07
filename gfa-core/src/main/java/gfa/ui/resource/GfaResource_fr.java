package gfa.ui.resource;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GfaResource_fr
    extends ListResourceBundle
{
    public Object[][] getContents()
    {
	return list;
    }
    
    static Object[][] list =
    {
	// The resources for menu titles in the menu bar.
	
	{"FileMenuAction.NAME",
	"Fichier"},
	{"FileMenuAction.MNEMONIC_KEY",
	 "f"},
	
	{"ExecutionMenuAction.NAME",
	 "Ex�cution"},
	{"ExecutionMenuAction.MNEMONIC_KEY",
	 "e"},
	
	{"InternationalMenuAction.NAME",
	 "International"},
	{"InternationalMenuAction.MNEMONIC_KEY",
	 "i"},
	
	{"HelpMenuAction.NAME",
	 "Aide"},
	{"HelpMenuAction.MNEMONIC_KEY",
	 "a"},
	
	// The resources for the various action of gfa.
	
	{"LoadRomAction.NAME",
	 "Charger Rom ..."},
	{"LoadRomAction.SHORT_DESCRIPTION", 
	 "Charge un fichier de rom en m�moire et r�initialise l'�tat du processeur."},
	{"LoadRomAction.LONG_DESCRIPTION",
	 "Ouvre une fen�tre dans laquelle l'utilisateur pourra choisir la rom � " +
	 "charger en m�moire. Cette op�ration r�initialise l'�tat du processeur."},
	{"LoadRomAction.MNEMONIC_KEY",
	 "c"},
	{"LoadRomAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK)},
	
	{"ExitAction.NAME",
	 "Quitter"},
	{"ExitAction.SHORT_DESCRIPTION",
	 "Quitte le logiciel Girlfriend Advance."},
	{"ExitAction.MNEMONIC_KEY",
	 "q"},
	
	{"ResetAction.NAME",
	 "R�initialise"},
	{"ResetAction.SHORT_DESCRIPTION",
	 "R�initialise le processeur."},
	{"ResetAction.MNEMONIC_KEY",
	 "i"},
	{"ResetAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_F2, Event.CTRL_MASK)},
	
	{"RunAction.NAME",
	 "Ex�cute"},
	{"RunAction.SHORT_DESCRIPTION",
	 "Lance l'ex�cution du programme."},
	{"RunAction.MNEMONIC_KEY",
	 "e"},
	{"RunAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0)},
	
	{"StopAction.NAME",
	 "Stop"},
	{"StopAction.SHORT_DESCRIPTION",
	 "Stoppe l'ex�cution du programme."},
	{"StopAction.MNEMONIC_KEY",
	 "t"},
	{"StopAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0)},
	
	{"StepAction.NAME",
	 "Marche"},
	{"StepAction.SHORT_DESCRIPTION",
	 "Ex�cute l'instruction courante."},
	{"StepAction.MNEMONIC_KEY",
	 "m"},
	{"StepAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0)},
	
	{"UndoAction.NAME",
	 "Revient"},
	{"UndoAction.SHORT_DESCRIPTION",
	 "Annule la derni�re instruction."},
	{"UndoAction.LONG_DESCRIPTION",
	 "Annule l'effet de l'ex�cution de la derni�re instruction. " +
	 "Cette option doit �tre activ�e explicitement parcequ'elle cause beaucoup " +
	 "de sauvegardes de l'�tat de l'�mulateur, et par cons�quent elle ralentit " +
	 "consid�rablement l'ex�cution du programme �mul�."},
	{"UndoAction.MNEMONIC_KEY",
	 "r"},
	{"UndoAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0)},
	
	{"NextAction.NAME",
	 "Suivante"},
	{"NextAction.SHORT_DESCRIPTION",
	 "Ex�cute le programme jusqu'� l'instruction suivante."},
	{"NextAction.MNEMONIC_KEY",
	 "s"},
	{"NextAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0)},
	
	{"BreakNextAction.NAME",
	 "Break Next"},
	{"BreakNextAction.SHORT_DESCRIPTION",
	 "Ex�cute jusqu'� ce que la condition sp�cifi�e soit vraie."},
	
	{"BreakPrevAction.NAME",
	 "Break Prev"},
	{"BreakPrevAction.SHORT_DESCRIPTION",
	 "Revient au dernier moment o� la condition sp�cifi�e �tait vraie."},
	
	{"FrenchLanguageAction.NAME",
	 "Fran�ais"},
	
	{"TwChineseLanguageAction.NAME",
	 "Chinois traditionel"},
	
	{"JapaneseLanguageAction.NAME",
	 "Japonais"},
	
	{"VietnameseLanguageAction.NAME",
	 "Vietnamien"},
	
	{"ThaiLanguageAction.NAME",
	 "Tha�landais"},
	
	{"ChineseLanguageAction.NAME",
	 "Chinois simplifi�"},
	
	{"EnglishLanguageAction.NAME",
	 "Anglais"},
	
	{"ScreenShotAction.NAME",
	 "Photo d'�cran"},
	{"ScreenShotAction.SHORT_DESCRIPTION",
	 "Prend une photo de l'�cran au prochain rafraichissement."},
	{"ScreenShotAction.LONG_DESCRIPTION",
	 "Option pour se la jouer � la \"Loft Story\" sur les jeux"},
	
	{"DocumentationAction.NAME",
	 "Documentation de Gfa"},
	{"DocumentationAction.SHORT_DESCRIPTION",
	 "La documentation de Girlfriend Advance."},
	{"DocumentationAction.LONG_DESCRIPTION",
	 "Affiche la documentation de Girlfriend Advance."},
	{"DocumentationAction.MNEMONIC_KEY",
	 "d"},
	{"DocumentationAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0)},
	
	{"AboutAction.NAME",
	 "A propos"},
	{"AboutAction.SHORT_DESCRIPTION",
	 "Informations � propos de Girlfriend Advance."},
	{"AboutAction.LONG_DESCRIPTION",
	 "Affiche les informations concernant Girlfriend Advance et son auteur " +
	 "Vincent Cantin, aussi connu sous le pseudonyme de \"karma of revelation\"."},
	{"AboutAction.MNEMONIC_KEY",
	 "a"},
	
	{"HomeDisasmAction.NAME",
	 "Maison"},
	{"HomeDisasmAction.SHORT_DESCRIPTION",
	 "Revient � l'instruction courante."},
	{"HomeDisasmAction.LONG_DESCRIPTION",
	 "Rend l'instruction courante visible sur le composant du d�sassembleur."},
	{"HomeDisasmAction.ACCELERATOR_KEY",
	 KeyStroke.getKeyStroke(KeyEvent.VK_HOME, Event.CTRL_MASK)},
	
	// The resources for tables.
	
	{"DisassemblerTableModel.columnName_0", "Position"},
	{"DisassemblerTableModel.columnName_1", "Opcode"},
	{"DisassemblerTableModel.columnName_2", "Instruction"},
	
	{"RegisterTableModel.columnName_0", "Nom"},
	{"RegisterTableModel.columnName_1", "Valeur"},
	
	// The resources for the disassembler menu.
	
	{"ViewMenuDisasmAction.NAME", "Voir"},
	{"BiosRomDisasmAction.NAME", "Rom du bios"},
	{"ExternalRamDisasmAction.NAME", "Ram externe"},
	{"WorkRamDisasmAction.NAME", "Ram de travail"},
	{"IoRegDisasmAction.NAME", "Registres e/s mat�rielles"},
	{"PaletteRamDisasmAction.NAME", "Ram de la palette"},
	{"VideoRamDisasmAction.NAME", "Ram vid�o"},
	{"OamRamDisasmAction.NAME", "Ram d'attribut des sprites"},
	{"GamepakRomDisasmAction.NAME", "Rom de la cartouche"},
	{"CartRamDisasmAction.NAME", "Rom de sauvegarde"},
	
	{"TrackMenuDisasmAction.NAME", "Suivi"},
	{"NoTrackingDisasmAction.NAME", "Pas de suivi"},
	{"CenterTrackingDisasmAction.NAME", "Suivi centr�"},
	{"WindowTrackingDisasmAction.NAME", "Suivi fen�tr�"},
	
	// The resources for InputPanel.
	
	{"InputPanel.up", "Haut"},
	{"InputPanel.down", "Bas"},
	{"InputPanel.left", "Gauche"},
	{"InputPanel.rigth", "Droite"},
	{"InputPanel.select", "Select"},
	{"InputPanel.start", "Start"},
	{"InputPanel.a", "A"},
	{"InputPanel.b", "B"},
	{"InputPanel.l", "L"},
	{"InputPanel.r", "R"}
    };
}
