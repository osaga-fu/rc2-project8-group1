import { render, fireEvent, screen } from "@testing-library/react";
import { List } from "../components/List/List";
import { test } from "vitest";
import { setupServer } from "msw/node";
import { handlers } from "./handlers";
import userEvent from "@testing-library/user-event";

const server = setupServer(...handlers);

test("realiza una búsqueda y muestra los resultados", async () => {
  render(<List />);

  const input = screen.getAllByPlaceholderText('Buscar libro...');
  userEvent.type(input, 'harry');
  const button = screen.getByRole('button', {name: 'search'});
  userEvent.click(button)=screen.getByRole('button', {name: 'searchButton'});
  userEvent.click(button);

  const bookTitle = await screen.findByText('Harry Potter y...');
  expect(bookTitle).toBeInTheDocument();
});
