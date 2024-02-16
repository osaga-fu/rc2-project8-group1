import {rest} from 'msw';

export const handlers = [
    rest.get('/api/searchbooks', (req, res, ctx)=>{
        console.log(req);
        const query = req.url.searchParams.get('q');
        if(query === 'harry'){

            return res(
                ctx.json([
                    {id: 1, title: 'Book 1'},
                    {id: 2, title: 'Book 2'}
                ])
            );
        } else {
            return res(
                ctx.json([])
            );
        }
    })
];