import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brain
{
    public static void main(String[] args)
    throws IOException
    {
        Brain brain = new Brain();

        System.out.println(brain.isColored());
    }

    public String isColored()
    throws IOException
    {
        int n = 0, m = 0;
        boolean colored = false;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(in.readLine());
        m = Integer.parseInt(in.readLine());

        char[][] photo = new char[n][m];

        for (int i = 0; i < photo.length; i++)
        {
            for (int j = 0; j < photo[i].length; j++)
            {
                photo[i][j] = in.readLine().toUpperCase().charAt(0);

                if(photo[i][j] == 'C' || photo[i][j] == 'M' || photo[i][j] == 'Y')
                {
                    colored = true;
                }
            }
        }

        if (colored)
        {
            return  "#Color";
        }

        return "#Black&White";
    }
}